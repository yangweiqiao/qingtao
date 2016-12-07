package com.zhoumai.qingtao.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.fragment.TabFragmentAdapter;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;
import com.zhoumai.qingtao.view.fragment.homeFragment.BrandFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.CashBackFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.HomeHomeFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.LimitedFragment;
import com.zhoumai.qingtao.view.fragment.homeFragment.SpeelGroupFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ${杨伟乔} on 2016/12/4.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class BusinessActivity extends AppCompatActivity {

    @BindView(R.id.tablayot)
    TabLayout privateTablayot;
    @BindView(R.id.viewpager_business)
    ViewPager privateViewpagerBusiness;
    private ArrayList<BaseFragemnt> fragments;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.coordinetorlayout);
        ButterKnife.bind(this);
        initData();
        privateViewpagerBusiness.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return fragments.get(position).getTitle();
            }
        });
        privateTablayot.setupWithViewPager(privateViewpagerBusiness);

    }


    public void initData() {
//创建子界面集合
        fragments = new ArrayList<>();
//添加子界面到集合中
        fragments.add(new HomeHomeFragment());
        fragments.add(new LimitedFragment());
        fragments.add(new SpeelGroupFragment());
        fragments.add(new BrandFragment());
        fragments.add(new CashBackFragment());


    }
}
