package com.zhoumai.qingtao.view.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

import java.util.ArrayList;

/**
 * Created by ${杨伟乔} on 2016/11/30.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class TabFragmentAdapter extends FragmentPagerAdapter {

    private final ArrayList<BaseFragemnt> fragments;

    public TabFragmentAdapter(FragmentManager fm, ArrayList<BaseFragemnt> fragments) {
        super(fm);
        this.fragments=fragments;
    }

    /**获取标题显示的tab**/
    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }
/**获取页面的总数 **/
    @Override
    public int getCount() {
        return fragments.size();
    }
/**获取当前要显示的pager**/
    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

}
