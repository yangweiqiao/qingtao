package com.zhoumai.qingtao.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.NET.Api;
import com.zhoumai.qingtao.NET.JsonUtil;
import com.zhoumai.qingtao.NET.NetUtils;
import com.zhoumai.qingtao.NET.onRequestDataFinish;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.contains.Contains;
import com.zhoumai.qingtao.model.Admin;
import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.utils.SpUtils;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.base.application.MyApp;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.umeng.analytics.MobclickAgent.onProfileSignIn;


/**
 * Created by yangweiqiao on 2016/11/26.
 */

public class LoginActivity extends BaseActivity {
    @BindView(R.id.frag_login_iv_back)
    ImageView privateFragLoginIvBack;
    @BindView(R.id.frag_login_tv_help)
    TextView privateFragLoginTvHelp;
    @BindView(R.id.act_home_et_phone)
    EditText privateActHomeEtPhone;
    @BindView(R.id.act_login_et_pwd)
    EditText privateActLoginEtPwd;
    @BindView(R.id.act_login_tv_login)
    TextView privateActLoginTvLogin;
    @BindView(R.id.act_login_tv_forget)
    TextView privateActLoginTvForget;
    @BindView(R.id.act_login_tv_reg)
    TextView privateActLoginTvReg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**加载布局*/
        setContentView(R.layout.activity_login);
        /**绑定控件*/
        ButterKnife.bind(this);
        /**添加activity到记录所有开启activity的集合中**/
        ActivityFinishUtils.addActivity(this);
    }


    @OnClick({R.id.frag_login_iv_back, R.id.frag_login_tv_help, R.id.act_login_tv_login, R.id.act_login_tv_forget, R.id.act_login_tv_reg})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.frag_login_iv_back://左上角的返回键

                break;
            case R.id.frag_login_tv_help://帮助按钮
                break;
            case R.id.act_login_tv_login://登录按钮
                //检验用户的信息  进行登录操作
                login();
                break;
            case R.id.act_login_tv_forget://忘记密码
                //跳转忘记密码的界面
                break;
            case R.id.act_login_tv_reg: //注册新账号
                //跳转注册界面
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }


    public void login() {
        //获取控件数据
        final String strUserInput = privateActHomeEtPhone.getText().toString().trim();
        final String strPwd = privateActLoginEtPwd.getText().toString().trim();
        //数据正确性判断
        if (strUserInput.isEmpty()) {
            T.showToast("手机/会员名/邮箱不能为空!");

        } else if (strPwd.isEmpty()) {
            T.showToast("密码不能为空!");
        } else {
            //进行登陆
            //显示加载进度条
            // view.showLoadingDialog("", "登陆中...", true);
//显示一个不可以点击外部被取消的对话框
            //开启网络请求
            //回调参数
            //判断用户是否登录
            //正确 回复 跳转界面到主界面
            //错误  提示用户的信息 是密码还是账号错误


            HashMap<String, Object> map = new HashMap<>();
            map.put("username", strUserInput);
            map.put("password", strPwd);
            NetUtils.requestData(Api.LOGIN, map, new onRequestDataFinish() {
                @Override
                public void requestdataFinish(String catalog, String json) {
                    System.out.println(json);
                    Admin admin = JsonUtil.parseJsonToBean(json, Admin.class);
                    if (admin.getCode() < 0) {
                        T.showToast(admin.getMessage());
                    } else {
                        //保存用户
                        MyApp.instance.setCurrentUser(admin.getResult());
                        /**
                         * 记录当前的登录状态为true
                         */
                        onProfileSignIn(strUserInput);//统计用户名
                        SpUtils.setBoolean(Contains.LOGIN, true);
/**
 * 跳转到主界面
 */
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));


                    }

                }

                @Override
                public void requestdataFailed() {
                    T.showToast("登录失败,没网就知道幸福离你远了!");
                }
            }, false);


        }


    }
    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
