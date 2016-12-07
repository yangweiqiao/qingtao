package com.zhoumai.qingtao.view.fragment.homeFragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.utils.Toastutils;
import com.zhoumai.qingtao.view.adapter.BaseListViewViewHolder;
import com.zhoumai.qingtao.view.adapter.MySuperListViewAdapter;
import com.zhoumai.qingtao.view.customview.RefreshListview;
import com.zhoumai.qingtao.view.fragment.base.BaseFragemnt;

import java.util.ArrayList;

/**
 * Created by ${杨伟乔} on 2016/11/30.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class BrandFragment extends BaseFragemnt implements AdapterView.OnItemClickListener {

    private RefreshListview privateBrandList;

    @Override
    public CharSequence getTitle() {
        return "品牌直购";
    }

    @Override
    public Object getContentView() {

        //  View inflate = LayoutInflater.from(context).inflate(R.layout.fragment_band, null, false);

        return R.layout.fragment_band;
    }

    @Override
    public void initView() {
        privateBrandList = findView(R.id.brand_list);
    }

    @Override
    public void initListener() {
//设置listview的条目监听
        //  privateBrandList.setOnItemClickListener(this);


    }

    @Override
    public void initData() {
        //初始化数据
        //测试数据
        ArrayList<String> strings = new ArrayList<>();

        for (int a = 0; a < 100; a++) {

            strings.add("条目是:" + a);


        }
        System.out.println("privateBrandList:" + privateBrandList);
        privateBrandList.setAdapter(new MySuperListViewAdapter(strings) {
            @Override
            public BaseListViewViewHolder setHolder() {
                BaseListViewViewHolder viewHolder = new BaseListViewViewHolder() {
                    @Override
                    public void setDatas(View view, Object obj) {

                        TextView viewById = (TextView) view.findViewById(R.id.textviewqqq);
                        viewById.setText((String) obj);
                    }

                    @Override
                    public int getItemId() {
                        return R.layout.item_band_listview;
                    }
                };

                return viewHolder;
            }
        });


        stateLayout.showContentView();

    }



    @Override
    public void requestdataFinish(String catalog, Object bean) {

    }

    @Override
    public void requestdataFailed() {

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //条目的点击事件
        Toastutils.showToast("点击的是条目:" + i);


    }
}
