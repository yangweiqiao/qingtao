package com.zhoumai.qingtao.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.NET.Api;
import com.zhoumai.qingtao.NET.NetUtils;
import com.zhoumai.qingtao.NET.onRequestDataFinish;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.ActivityFinishUtils;
import com.zhoumai.qingtao.view.customview.NoscrollViewPager;
import com.zhoumai.qingtao.view.fragment.CategoryFragment;
import com.zhoumai.qingtao.view.fragment.GoodsFragment;
import com.zhoumai.qingtao.view.fragment.HomeFragment;
import com.zhoumai.qingtao.view.fragment.MeFragment;

import java.util.ArrayList;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 程序的主界面
 */
public class MainActivity extends BaseActivity implements onRequestDataFinish, RadioGroup.OnCheckedChangeListener {


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
        homeTabGroup.setOnCheckedChangeListener(this);

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

        NetUtils.requestData(Api.ACCOUNT_SAVE, null, this, false);
        super.onDestroy();

    }


    @Override
    public void requestdataFinish(String key, String xml) {

        switch (key){

            case Api.API_CAT_BRAND:

                System.out.println(xml);


                break;

            case Api.API_CATLIST:
                
                System.out.println(xml);


                break;


            case Api.GET_BRAND_INFO:
                System.out.println(xml);
                break;

        }






    }

    @Override
    public void requestdataFailed() {






    }




    public void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {



                switch (checkedId) {
                    case R.id.home_tab:
                        noscrollViewPager.setCurrentItem(0,false);

                        NetUtils.requestData(Api.API_CATLIST, null,this, false);

                        break;

                    case R.id.category_tab:
                        noscrollViewPager.setCurrentItem(1,false);
                        NetUtils.requestData(Api.API_CAT_BRAND, null,this, false);

                        break;
                    case R.id.goods_tab:
                        noscrollViewPager.setCurrentItem(2,false);


                       final HashMap<String ,Object>  map  =new HashMap<>();


                        map.put("brandId",2238);
                        NetUtils.requestData(Api.GET_BRAND_INFO, map,this, false);
                        break;
                    case R.id.me_tab:
                        noscrollViewPager.setCurrentItem(3,false);

                        break;

                }












    }
}