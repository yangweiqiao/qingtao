package com.zhoumai.qingtao.view.customview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.zhoumai.qingtao.R;

/**
 * Created by ${杨伟乔} on 2016/12/4.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class CheckHeader extends Dialog  {




    public CheckHeader(Context context) {
        super(context);
    }

    protected CheckHeader(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    View contentView;

    public CheckHeader(Context context, int defStyle) {
        super(context, defStyle);

        //添加布局文件
        contentView = getLayoutInflater().inflate(
                R.layout.dialog_photo, null);


        //去掉Dialog标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        contentView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                CheckHeader.this.dismiss();
                return true;
            }
        });
        //给对话框设置自定义的View
        setContentView(contentView);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置对话框在当前Window的居中位置
        getWindow().setGravity(Gravity.BOTTOM);

        //设置对话框的宽度和屏幕的宽度相等
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = d.getWidth();
        // 设置对话框的高度
        p.height = 600;
        getWindow().setAttributes(p);


    }







}
