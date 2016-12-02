package com.zhoumai.qingtao.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.activity.SettingActivity;
import com.zhoumai.qingtao.view.adapter.GalleryAdapter;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;


/**
 * Created by 杨伟乔 on 2016/11/23.
 * 邮箱:  yangweiqiao@126.com
 * CSDN: www.csdn.net/yangweiqiao
 * 神兽保佑,代码永无BUG
 */

public class MeFragment extends BaseFragemnt implements View.OnClickListener {

/**提取变量**/
    /**
     * 我的世界的控件
     */
    private GridView myWorldGridView;
    /**
     * 可能喜欢
     **/
    private GridView maybeLovegridView;
    /**
     * 浏览记录
     **/
    RecyclerView Browserecords;
    //设置我的界面的数据
    //配置gridView的数据
    /**
     * 我的世界的参数
     **/
    private int[] icon = {
            R.mipmap.ceshi1, R.mipmap.ceshi1, R.mipmap.ceshi1,
            R.mipmap.ceshi1, R.mipmap.ceshi1, R.mipmap.ceshi1,
    };
    private String[] iconName = {
            "我的收藏", "购物车", "优惠券",
            "我的钱包", "我是商家", "我是会员"
    };

    private String[] icon2Name = {
            "全球闪购", "爆款拼团", "品牌直购",
            "轻淘返现"
    };

    @Override
    public CharSequence getTitle() {
        return "我的";
    }

    @Override
    public Object getContentView() {

        //  View.inflate(MyApp.getContext(), R.layout.fragment_me,null);

        TextView textView = new TextView(context);
        textView.setText("你好.这是我的界面,显示的是加载成功的界面 ");
        return R.layout.frag_personal;
    }

    @Override
    public void initView() {
//设置的按钮
        ImageView view = findView(R.id.frag_personal_settings);
        view.setOnClickListener(this);

        myWorldGridView = findView(R.id.myWorld_GridView);

        maybeLovegridView = findView(R.id.maybeLovegridView);
        Browserecords = findView(R.id.id_recyclerview_horizontal);
        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        Browserecords.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        stateLayout.showContentView();
        ArrayList<HashMap<String, Object>> maps = new ArrayList<>();

        for (int i = 0; i < iconName.length; i++) {

            HashMap<String, Object> map = new HashMap<String, Object>();

            map.put("ItemImage", icon[i]);
            map.put("ItemText", iconName[i]);
            maps.add(map);

        }
//创建适配器
        SimpleAdapter simpleAdapter = new SimpleAdapter(MyApp.getContext(), maps, R.layout.item_gridview, new String[]{
                "ItemImage", "ItemText"}, new int[]{R.id.item_image, R.id.item_text});

        //设置适配器 gridView
        myWorldGridView.setAdapter(simpleAdapter);

        //设置消息点击处理
        myWorldGridView.setOnItemClickListener(new ItemClickListener());


        //设置下面的可能喜欢的数据
//        maybeLovegridView

        ArrayList<HashMap<String, Object>> maps2 = new ArrayList<>();

        for (int i = 0; i < icon2Name.length; i++) {

            HashMap<String, Object> map = new HashMap<String, Object>();


            map.put("ItemText", icon2Name[i]);
            maps2.add(map);

        }
//创建适配器
        SimpleAdapter simpleAdapter2 = new SimpleAdapter(MyApp.getContext(), maps2, R.layout.item_gridview2, new String[]{
                "ItemText"}, new int[]{R.id.item_text2});

        //设置适配器 gridView
        maybeLovegridView.setAdapter(simpleAdapter2);

        //设置消息点击处理
        maybeLovegridView.setOnItemClickListener(new ItemClickListener());


        /**
         * 水平的滚动的浏览记录
         */

        //        加载数据  当数据成功后添加适配器


        /**
         * 测试数据
         */
        // TODO: 2016/12/2

        final List<String> strings = new ArrayList<>();
        strings.add("测试");
        strings.add("打发打发");
        strings.add("对对对");
        strings.add("我的");
        strings.add("的积分回");
        strings.add("啊啊");
        strings.add("急急急");

        //设置适配器
        GalleryAdapter mAdapter = new GalleryAdapter(getContext(), strings);
        Browserecords.setAdapter(mAdapter);

        mAdapter.setOnItemClickLitener(new GalleryAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                T.showToast("条目的点击事件: 位置是=" + position + ",显示的控件内容是:" + strings.get(position));
            }
        });
    }


    @Override
    public void requestdataFinish(String catalog, String json) {

    }

    @Override
    public void requestdataFailed() {

    }

    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("MeFragment"); //统计页面，"MainScreen"为页面名称，可自定义
    }

    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("MeFragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.frag_personal_settings:

                T.showToast("点击的是设置");
/**
 * 创建意图 控制界面的跳转
 */
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                /**开启界面 **/
                startActivity(intent);

                break;

        }
    }


    /**
     * gridview的消息点击处理事件
     */

    class ItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (parent.getId()) {
                case R.id.myWorld_GridView:

                    T.showToast("点击条目的事件");

                    HashMap<String, Object> itemAtPosition = (HashMap<String, Object>) parent.getItemAtPosition(position);
                    String itemText = (String) itemAtPosition.get("ItemText");
                    System.out.println("显示的名字是:   " + itemText);
                    break;


                case R.id.maybeLovegridView:
                    HashMap<String, Object> itemAtPositions = (HashMap<String, Object>) parent.getItemAtPosition(position);
                    String itemText2 = (String) itemAtPositions.get("ItemText");
                    System.out.println("显示的名字是:   " + itemText2);

                    break;
            }


        }
    }

}
