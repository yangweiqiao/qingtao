package com.zhoumai.qingtao.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.view.activity.goods.GoodsDetailActivity;
import com.zhoumai.qingtao.view.activity.settings.AddAddressActivity;
import com.zhoumai.qingtao.view.activity.settings.SettingActivity;
import com.zhoumai.qingtao.view.customview.MultipleTextViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseActivity implements MultipleTextViewGroup.OnMultipleTVItemClickListener {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sousuo);
        context = getConText();

        List<String> dataList = new ArrayList<String>();

        dataList.add("鞋子");
        dataList.add("iPhone7皮套");

        dataList.add("面膜");
        dataList.add("Mason Mason Mason");

        dataList.add("水墨");
        dataList.add("天盟");
        dataList.add("芬达");
        dataList.add("中国");

        dataList.add("Mason");
        dataList.add("说莫");
        dataList.add("不说");
        dataList.add("好吧");


        MultipleTextViewGroup rl = (MultipleTextViewGroup) findViewById(R.id.main_rl);
        rl.setOnMultipleTVItemClickListener(this);
        rl.setTextViews(dataList);

    }


    public void onMultipleTVItemClick(View view, int position) {
        Toast.makeText(getApplicationContext(), "sssss" + position, Toast.LENGTH_SHORT).show();

        // TODO: 2016/12/8 测试跳转商品的详情界面
        startActivity(new Intent(context, GoodsDetailActivity.class));


    }

}
