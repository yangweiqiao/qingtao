package com.zhoumai.qingtao.goodslayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ${杨伟乔} on 2016/12/9.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class MyFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment, null);


        return view;


    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ListView listView = (ListView) view.findViewById(android.R.id.list);

        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            datas.add("data: " + i);
        }

        final View footView = getActivity().getLayoutInflater()
                .inflate(R.layout.slidedetails_marker_default_layout, null);
        footView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open(true);
            }
        });

        listView.addFooterView(footView);
        listView.setAdapter(new Adapter(datas));
    }

    private class Adapter extends BaseAdapter {

        private List<String> datas;

        Adapter(List<String> datas) {
            this.datas = datas;
        }

        @Override
        public int getCount() {
            return null == datas ? 0 : datas.size();
        }

        @Override
        public String getItem(int position) {
            return null == datas ? null : datas.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (null == convertView) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.layout_list_item, null);
            }
            final TextView textView = (TextView) convertView.findViewById(android.R.id.text1);
            textView.setText(getItem(position));
            return convertView;
        }
    }


}
