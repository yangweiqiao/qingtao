package com.zhoumai.qingtao.view.fragment.base;

import java.util.Collection;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.NET.JsonRequestCallback;

import com.zhoumai.qingtao.view.customview.StateLayout;


/**
 * Base的功能就是专门给别人继承的
 *
 * @author dzl
 */
@SuppressWarnings("unused")
public abstract class BaseFragemnt extends Fragment implements JsonRequestCallback {

    protected Activity context;
   public StateLayout stateLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        context = getActivity();
        // inflate方法返回值就是填充的布局的根控件
        // 填充出来的StateLayout已经包含了3种状态了
          stateLayout = (StateLayout) inflater.inflate(R.layout.state_layout, null);

        // 设置第4种状态：正常界面的状态。由于这里是Base类，Base类没有办法知道子View需要设置的正常界面是什么，所以正常界面的获取写成抽象方法由子类自己去实现。
        stateLayout.setContentView(getContentView());

        initView();
        initListener();
        initData();
        return stateLayout;
    }

    /**
     * 增加这个方法是为了省略强转操作
     *
     * @param id 这个现在很少用到 都是黄油刀使用找控件
     * @return
     */
    public <T> T findView(int id) {
        @SuppressWarnings("unchecked")
        T view = (T) stateLayout.findViewById(id);
        return view;
    }

    /**
     * 根据服务器返回的数据判断要显示哪一个View
     *
     * @param datas
     * @return
     */
    public boolean checkDatas(Collection<?> datas) {
        boolean result = false;
        if (datas == null) {
            stateLayout.showFailView();
        } else if (datas.isEmpty()) {
            stateLayout.showEmptyView();
        } else {
            stateLayout.showContentView();
            result = true;
        }
        return result;
    }

    /**
     * 根据服务器返回的数据判断要显示哪一个View
     *
     * @param datas
     * @return
     */
    public boolean checkDatas(Map<?, ?> datas) {
        boolean result = false;
        if (datas == null) {
            stateLayout.showFailView();
        } else if (datas.isEmpty()) {
            stateLayout.showEmptyView();
        } else {
            stateLayout.showContentView();
            result = true;
        }
        return result;
    }

    /**
     * 返回Fragment的标题名称
     */
    public abstract CharSequence getTitle();

    /**
     * 返回一个用于设置正常界面的View，可以是一个View，也可以是一个布局id
     */
    public abstract Object getContentView();

    /**
     * 初始化View的代码写在这个方法中
     */
    public abstract void initView();

    /**
     * 初始化监听器的代码写在这个方法中
     */
    public abstract void initListener();

    /**
     * 初始化数据的代码写在这个方法中
     */
    public abstract void initData();


}
