package com.zhoumai.qingtao.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.customview.NoscrollViewPager;
import com.zhoumai.qingtao.view.fragment.CategoryFragment;
import com.zhoumai.qingtao.view.fragment.GoodsFragment;
import com.zhoumai.qingtao.view.fragment.HomeFragment;
import com.zhoumai.qingtao.view.fragment.MeFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 程序的主界面
 */
public class MainActivity extends FragmentActivity {


    @BindView(R.id.home_tab)
    RadioButton homeTab;
    @BindView(R.id.category_tab)
    RadioButton categoryTab;
    @BindView(R.id.goods_tab)
    RadioButton goodsTab;
    @BindView(R.id.me_tab)
    RadioButton meTab;
    @BindView(R.id.home_tab_group)
    RadioGroup homeTabGroup;
    @BindView(R.id.noscrollViewPager)
    NoscrollViewPager noscrollViewPager;


    ArrayList<Fragment> fragments = new ArrayList<Fragment>();

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

    }

    private void initListener() {
        //设置viewpager的默认加载页数
        noscrollViewPager.setOffscreenPageLimit(fragments.size() - 1);
        //默认显示首页
        noscrollViewPager.setCurrentItem(0);

/**
 * 底部的radiogroup的监听事件
 */
        homeTabGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int iposition) {


                switch (iposition) {
                    case R.id.home_tab:
                        noscrollViewPager.setCurrentItem(0,false);

                        break;

                    case R.id.category_tab:
                        noscrollViewPager.setCurrentItem(1,false);

                        break;
                    case R.id.goods_tab:
                        noscrollViewPager.setCurrentItem(2,false);

                        break;
                    case R.id.me_tab:
                        noscrollViewPager.setCurrentItem(3,false);

                        break;

                }
            }
        });

    }


    /**
     * 初始化数据
     **/
    private void initDatas() {
        /**
         * 添加四个fragment到集合中
         */
        fragments.add(new HomeFragment());
        fragments.add(new CategoryFragment());
        fragments.add(new GoodsFragment());
        fragments.add(new MeFragment());
        /**
         * 设置适配器
         */
        noscrollViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

        });

    }


    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();

    }


}