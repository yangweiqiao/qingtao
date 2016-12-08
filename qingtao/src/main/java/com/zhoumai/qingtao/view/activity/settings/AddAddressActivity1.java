package com.zhoumai.qingtao.view.activity.settings;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.contact.Contact;
import com.zhoumai.qingtao.contact.QueryContactUtils;
import com.zhoumai.qingtao.view.activity.BaseActivity;
import com.zhoumai.qingtao.view.adapter.BaseListViewViewHolder;
import com.zhoumai.qingtao.view.adapter.MySuperListViewAdapter;
import com.zhoumai.qingtao.view.adapter.MyViewPageAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ${杨伟乔} on 2016/12/5.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class AddAddressActivity1 extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.ib_titlebar_back)
    ImageView privateIbTitlebarBack;
    @BindView(R.id.ib_titlebar_add)
    TextView privateIbTitlebarAdd;
    @BindView(R.id.shouhuorenname)
    EditText privateShouhuorenname;
    @BindView(R.id.shdz_phone)
    EditText privateShdzPhone;
    @BindView(R.id.img_btn)
    ImageButton privateImgBtn;
    @BindView(R.id.xiangxidizhi)
    EditText privateXiangxidizhi;
    @BindView(R.id.listview)
    ListView privateListview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_address2);
        ButterKnife.bind(this);

        privateImgBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /**
         * 读取联系人的列表
         */


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_PICK);
        intent.setData(Contacts.People.CONTENT_URI);
        startActivityForResult(intent,

                1

        );




    }


}
