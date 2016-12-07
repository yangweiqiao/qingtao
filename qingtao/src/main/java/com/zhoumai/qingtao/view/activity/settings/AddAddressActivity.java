package com.zhoumai.qingtao.view.activity.settings;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.activity.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ${杨伟乔} on 2016/12/5.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class AddAddressActivity extends BaseActivity implements View.OnClickListener {


    private static final int IB_TITLEBAR_SHARE = 1001;
    @BindView(R.id.listview_address)
    ListView privateListviewAddress;
    private TextView tv_basepager_title;
    private TextView ib_titlebar_add;
    private RelativeLayout title_bar;
    private ImageView titlebarBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //添加地址的界面

        setContentView(R.layout.activity_add_address);
        ButterKnife.bind(this);

//初始化控件
        initView();
        initData();
        initListener();
    }


    private void initView() {

        title_bar = (RelativeLayout) findViewById(R.id.title_bar);
        title_bar.setBackgroundColor(Color.parseColor("#ffffff"));

        //地址的列表     privateListviewAddress;

        //返回按钮
        titlebarBack = (ImageView) findViewById(R.id.ib_titlebar_back);
        ib_titlebar_add = (TextView) findViewById(R.id.ib_titlebar_add); //添加地址的按钮
        tv_basepager_title = (TextView) findViewById(R.id.tv_basepager_title);//标题设置

    }

    /**
     * 监听器
     */
    private void initListener() {
        titlebarBack.setOnClickListener(this);//返回图标
        ib_titlebar_add.setOnClickListener(this);//添加新的地址


    }

    /**
     * 初始化数据
     */
    private void initData() {
//网络请求数据  返回当前用户的联系人列表
//模拟假的数据


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ib_titlebar_add:
                //点击的是添加地址的按钮 这里可以和点击编辑的时候共用一个界面 编辑的时候 需要把数据带着过去
                Intent intent = new Intent(this, AddAddressActivity1.class);

                startActivityForResult(intent, IB_TITLEBAR_SHARE);


                break;

            case R.id.ib_titlebar_back:
//直接关闭界面  判断用户有没有选择默认地址  判断地址有没有更新 打开的界面返回的数据在这里显示 添加到集合中 直接刷新listview 如果有选择添加了或者编辑了新的地址 我们要更新服务器的数据
                //也可以在打开的额界面直接保存 看需求
                // TODO: 2016/12/5

                finish();


                break;

        }
    }


    /**
     * 打开的界面返回的数据
     */


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        /**
         * 根据请求码来确定返回的数据是什么
         */


    }
}
