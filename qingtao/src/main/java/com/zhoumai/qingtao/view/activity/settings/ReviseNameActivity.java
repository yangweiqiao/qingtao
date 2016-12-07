package com.zhoumai.qingtao.view.activity.settings;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.DimenRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.DensityUtils;
import com.zhoumai.qingtao.view.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.zhoumai.qingtao.R.id.ib_titlebar_share;

/**
 * Created by ${杨伟乔} on 2016/12/5.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 * <p>
 * 分析:
 * 用户进来这个界面 是需要修改昵称的
 * 点击×号 删除已经输入的昵称 或者是进入页面默认显示的昵称
 * 当用户需要保存的时候,点击右上角的按钮 直接返回上个界面 返回的时候带着昵称的数据 或者是直接更新后进入另外的界面刷新数据
 */

public class ReviseNameActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.revise_name)
    EditText privateReviseName;  //修改昵称的控件
    @BindView(R.id.nc_delet)
    ImageView privateNcDelet;  //一键删除已经输入的昵称
    private TextView title;
    private ImageView back;
    private TextView share;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /***
         * 修改昵称的界面
         */

        setContentView(R.layout.activity_revisename);
        ButterKnife.bind(this);
        initView();
        initListener();
        initDatas();
    }

    /**
     * 初始化控件
     */
    private void initView() {


        title = (TextView) findViewById(R.id.tv_basepager_title);
        //设置标题为修改昵称

        back = (ImageView) findViewById(R.id.ib_titlebar_back);
        share = (TextView) findViewById(ib_titlebar_share);


    }

    /**
     * 数据的操作
     */
    private void initDatas() {
        title.setText("昵称");
        share.setText("保存");
//        share.setTextSize(R.dimen.x44);

        Intent intent = getIntent();
        String names = (String) intent.getCharSequenceExtra("name");
//设置默认的昵称
        privateReviseName.setHint(names);

    }

    /**
     * 监听器的操作
     */
    private void initListener() {
        /*
        为图片控件设置监听器
         */

        privateNcDelet.setOnClickListener(this);
        back.setOnClickListener(this);
        share.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nc_delet:

//                取消昵称 修改

                privateReviseName.setText("");  //直接设置为空的

                break;
            case R.id.ib_titlebar_back:
                //返回上个界面 不保存数据
//和物理按键返回键是一样的
                ReviseNameActivity.this.finish();  //

                break;

            case R.id.ib_titlebar_share:  // TODO: 2016/12/5 这里如果需要直接联网更新 再添加联网更新的方法
                //保存昵称 带回数据给上个界面
                Intent intent = new Intent();
                //获取上个界面的昵称
                String name = privateReviseName.getText().toString().trim();
                //添加数据
                intent.putExtra("name", name);
                //设置返回的数据
                ReviseNameActivity.this.setResult(10020, intent);
                //关闭当前的界面 并且返回结果给上个界面
                ReviseNameActivity.this.finish();
                break;

        }
    }
}
