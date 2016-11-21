package com.zhoumai.qingtao;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.zhoumai.qingtao.adapter.MyViewPageAdapter;
import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.view.NoscrollViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 程序的主界面
 */
public class MainActivity extends FragmentActivity {
    @BindView(R.id.tv_basepager_title)
    TextView tvBasepagerTitle;
    @BindView(R.id.ib_basepager_menu)
    ImageButton ibBasepagerMenu;
    @BindView(R.id.ib_titlebar_back)
    ImageButton ibTitlebarBack;
    @BindView(R.id.ib_titlebar_share)
    ImageButton ibTitlebarShare;
    @BindView(R.id.vp_content_pagers)
    NoscrollViewPager vpContentPagers;
    @BindView(R.id.rb_content_home)
    RadioButton rb_content_home;
    @BindView(R.id.rb_content_classify)
    RadioButton rb_content_classify;
    @BindView(R.id.rb_content_purchase)
    RadioButton rb_content_purchase;
    @BindView(R.id.rb_content_me)
    RadioButton rb_content_me;
    @BindView(R.id.rg_content_bottom)
    RadioGroup rgContentBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //记录activity到集合
        ActivityFinishUtils.addActivity(this);

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


    private void initDatas() {

        MyViewPageAdapter adapter = new MyViewPageAdapter(null);
        vpContentPagers.setAdapter(adapter);

    }

    private void init() {
//默认显示首页
        vpContentPagers.setCurrentItem(0);

    }

    /**
     * 按钮的点击事件
     */
    private void initListener() {

        rgContentBottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.rb_content_home://单击底部的首页的按钮
                        vpContentPagers.setCurrentItem(0);
                        break;
                    case R.id.rb_content_classify://单击的是底部的分类按钮
                        vpContentPagers.setCurrentItem(1);
                        break;
                    case R.id.rb_content_purchase://单击的是底部的订单按钮
                        vpContentPagers.setCurrentItem(2);
                        break;
                    case R.id.rb_content_me://单击的是底部的我的按钮
                        vpContentPagers.setCurrentItem(3);
                        break;


                }


            }
        });


    }


}
