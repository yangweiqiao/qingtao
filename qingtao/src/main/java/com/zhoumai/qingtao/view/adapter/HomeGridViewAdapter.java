package com.zhoumai.qingtao.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhoumai.qingtao.R;

import java.util.Collection;
import java.util.List;

import static android.R.id.list;

/**
 * Created by ${杨伟乔} on 2016/12/6.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class HomeGridViewAdapter extends MySuperListViewAdapter {


    private List<?> list = null;


    public HomeGridViewAdapter(List<?> list) {
        super(list);

        this.list = list;


    }


    @Override
    public int getCount() {
        return 9;
    }

    @Override
    public BaseListViewViewHolder setHolder() {


        return new MyViewHolder();
    }

    class MyViewHolder extends BaseListViewViewHolder {


        @Override
        public void setDatas(View view, Object obj) {
            //返回对象是商品的信息
//商品图片
            ImageView sp_imgview = (ImageView) view.findViewById(R.id.sp_imgview);
//            商品名称
            TextView home_sp_name = (TextView) view.findViewById(R.id.home_sp_name);
            //商品价格
            //商品原价
            TextView home_sp_price = (TextView) view.findViewById(R.id.home_sp_price);
            TextView home_sp_oldprice = (TextView) view.findViewById(R.id.home_sp_oldprice);


            /**
             * 设置集合里面对应的数据
             */

           // sp_imgview.setImageResource(R.mipmap.search);
            home_sp_name.setText("测试商品");
            home_sp_name.setText("¥ 99");
            home_sp_name.setText("原价 199");




        }

        @Override
        public int getItemId() {
            return R.layout.item_home_gridview;
        }
    }
}
