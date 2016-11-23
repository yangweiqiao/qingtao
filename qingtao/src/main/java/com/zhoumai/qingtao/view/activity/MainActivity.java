package com.zhoumai.qingtao.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.view.adapter.MyViewPageAdapter;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 程序的主界面
 */
public class MainActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)  //toolbar 
            Toolbar toolbar;
    @BindView(R.id.iv_seacher)  //搜索按钮
            ImageButton ivSeacher;
    /**
     * FragmentTabHost相关
     */
    private FragmentTabHost tabhost;
    private TabHost.TabSpec tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //记录activity到集合
        ActivityFinishUtils.addActivity(this);
        initTab();
        /**
         * 初始化数据
         */

        initDatas();
/**
 * 初始化监听器 主要是底部的按钮
 */
        initListener();
//   viewpager      vpContentPagers;vpContentPagers

        init();
    }

    private void initListener() {

    }

    /**
     * fragment 1 2 3 4对应下面的4个按钮
     */
    private void initTab() {
        /**
         * 查找控件
         */
        tabhost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        /**
         * 设置内容
         */
        tabhost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        tab = tabhost.newTabSpec("fragment1");
        /** 设置显示的view **/
        TextView textView = new TextView(this);
        textView.setText("首页");
        //View inflate = View.inflate(this, R.layout.splash, null);
        tab.setIndicator(textView);//这里添加的参数是view 可以使布局文件 也可以是创建的view对象
        tabhost.addTab(tab, BaseFragemnt.class, null);

        /*同样的方式添加剩下的tab */


        tab = tabhost.newTabSpec("fragment2");
        /** 设置显示的view **/
        TextView textView2 = new TextView(this);
        textView.setText("首页2");
        tab.setIndicator(textView);//这里添加的参数是view 可以使布局文件 也可以是创建的view对象
        tabhost.addTab(tab, BaseFragemnt.class, null);

        tab = tabhost.newTabSpec("fragment3");
        /** 设置显示的view **/
        TextView textView3 = new TextView(this);
        textView.setText("首页3");
        tab.setIndicator(textView);//这里添加的参数是view 可以使布局文件 也可以是创建的view对象
        tabhost.addTab(tab, BaseFragemnt.class, null);

        tab = tabhost.newTabSpec("fragment4");
        /** 设置显示的view **/
        TextView textView4 = new TextView(this);
        textView.setText("首页3");
        tab.setIndicator(textView);//这里添加的参数是view 可以使布局文件 也可以是创建的view对象
        tabhost.addTab(tab, BaseFragemnt.class, null);


    }


    private void initDatas() {

        MyViewPageAdapter adapter = new MyViewPageAdapter(null);


    }

    private void init() {
//默认显示首页


    }

}