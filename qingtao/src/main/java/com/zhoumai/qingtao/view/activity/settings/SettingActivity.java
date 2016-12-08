package com.zhoumai.qingtao.view.activity.settings;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.contact.Contact;
import com.zhoumai.qingtao.contact.QueryContactUtils;
import com.zhoumai.qingtao.utils.AppUtils;
import com.zhoumai.qingtao.utils.DataCleanManager;
import com.zhoumai.qingtao.utils.Toastutils;
import com.zhoumai.qingtao.utils.UpdateVersion;
import com.zhoumai.qingtao.view.activity.BaseActivity;
import com.zhoumai.qingtao.view.base.application.MyApp;
import com.zhoumai.qingtao.view.customview.CheckHeader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ${杨伟乔} on 2016/12/2.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */
public class SettingActivity extends BaseActivity {


    private static final int MY_PERMISSIONS_REQUEST_CAMRE = 1000;
    private static final int MY_PERMISSIONS_REQUEST_PHOTO = 999;
    private static final int ADDADDRESS = 1001;  //请求添加地址的界面的请求码
    private static final int SEETINGNAME = 1002;
    private static final int REVISE_EMIL = 1004;
    @BindView(R.id.img_header)
    LinearLayout privateImgHeader;
    @BindView(R.id.setting_gridView)
    GridView privateSettingGridView;
    @BindView(R.id.my_touxiang)
    ImageView privateMyTouxiang;
    @BindView(R.id.setting_name)
    TextView privateSettingName;
    @BindView(R.id.revisename)
    LinearLayout privateRevisename;


    @BindView(R.id.revisephone)
    LinearLayout revisephone;
    @BindView(R.id.setting_phone)
    TextView privateSettingPhone;
    @BindView(R.id.setting_emil)
    TextView privateSettingEmil;
    @BindView(R.id.text_adress)
    TextView privateTextAdress;
    @BindView(R.id.me_adress)
    LinearLayout privateMeAdress;
    @BindView(R.id.me_emil)
    LinearLayout privateMeEmil;


    private CheckHeader dialog;
    private int[] icon = {
            R.mipmap.sz_1_icon, R.mipmap.sz_2_icon, R.mipmap.sz_3_icon,
            R.mipmap.sz_4_icon, R.mipmap.sz_5_icon, R.mipmap.sz_6_icon,
    };


    /**
     * String name = item.title;
     * String uname = "【题】";
     * String str = name + uname;
     * final SpannableStringBuilder sp = new  SpannableStringBuilder(str);
     * sp.setSpan(new ForegroundColorSpan(0xFFFF0000), name.length(), str.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //字体颜色
     * sp.setSpan(new AbsoluteSizeSpan(10, true), name.length(), str.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //字体大小
     * holder.title.setText(sp);
     */

    String zh = "0";
    String versionName = "1.0";
    String cacheSize = "32.0KB";


    private RelativeLayout titleBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局文件
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);

        initview();
        initListener();
        initdatas();

    }

    private void initListener() {


    }

    private void initview() {
//创建控件的方法
        //标题栏
        titleBar = (RelativeLayout) findViewById(R.id.title_bar);
//设置颜色
        titleBar.setBackgroundColor(Color.parseColor("#ffffff"));


    }

    private void initdatas() {
        /**
         * 设置下面的gridView的信息   比如 版本号 缓存大小
         */
        //获取版本号
        versionName = AppUtils.getVersionName(MyApp.getInstance());
        //获取缓存大小
        try {
            cacheSize = DataCleanManager.getTotalCacheSize(MyApp.getInstance());
        } catch (Exception e) {
            throw new RuntimeException("获取缓存异常");
        }
/*
获取绑定的账号数量

 */
        // TODO: 2016/12/5 获取绑定的账号

        String[] iconName = {
                zh + "\n已绑账号", versionName + "\n检查更新", cacheSize + "\n清理缓存",
                "我的爱好", "账户安全", "未实名认证"
        };


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
        privateSettingGridView.setAdapter(simpleAdapter);

        //设置消息点击处理
        privateSettingGridView.setOnItemClickListener(new ItemClickListener());

    }

    class ItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (parent.getId()) {
                case R.id.setting_gridView:
//根据位置判断点击的是什么
                    switch (position) {
                        case 0:
                            Toastutils.showToast("点击绑定账号");

                            break;
                        case 1:
                            Toastutils.showToast("点击检查更新");
                            new UpdateVersion().update(SettingActivity.this, SettingActivity.class);

                            break;
                        case 2:
                            Toastutils.showToast("点击清理缓存");
                            DataCleanManager.cleanExternalCache(MyApp.getContext());
                            initdatas();

                            break;
                        case 3:
                            Toastutils.showToast("点击我的爱好");
                            break;
                        case 4:
                            Toastutils.showToast("点击绑定账户");



                            break;
                        case 5:
                            Toastutils.showToast("点击实名认证");
//
                            break;

                    }
            }
        }
    }

    @OnClick({R.id.img_header, R.id.me_adress, R.id.revisename, R.id.revisephone,R.id.me_emil})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_header:
                //点击设置头像 弹出一个对话框 自定义对话框
                dialog = new CheckHeader(SettingActivity.this, R.style.quick_option_dialog);
                dialog.setCancelable(true);
                dialog.setCanceledOnTouchOutside(true);//设置触摸对话框外部则消失
                dialog.show();
                Window window = dialog.getWindow();
                /*
                找出控件
                 */
                Button xiangce = (Button) window.findViewById(R.id.xiangce);
                Button paizhao = (Button) window.findViewById(R.id.paizhao);
                Button cancel = (Button) window.findViewById(R.id.cancle);
                /*
                设置监听
                 */
                xiangce.setOnClickListener(new buttonClick());
                paizhao.setOnClickListener(new buttonClick());
                cancel.setOnClickListener(new buttonClick());
                break;

            //点击修改昵称
            case R.id.revisename:
                //需要把自己现在的昵称带着过去默认显示
                Intent intent = new Intent(SettingActivity.this, ReviseNameActivity.class);
                intent.putExtra("name", privateSettingName.getText().toString());
                startActivityForResult(intent, SEETINGNAME);
                break;


            //设置手机号码
            case R.id.revisephone:




                break;


            //设置邮箱
            case R.id.me_emil:


                startActivityForResult(new Intent(SettingActivity.this,EmilActivity.class), REVISE_EMIL);
                break;


            //点击我的地址 弹出一个新的界面设置地址  收货地址
            case R.id.me_adress:
                startActivityForResult(new Intent(SettingActivity.this, AddAddressActivity.class), ADDADDRESS);
                break;


        }


    }

    private class buttonClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.xiangce:
                    intent = new Intent();
                    /* 开启Pictures画面Type设定为image */
                    intent.setType("image/*");
                    /* 使用Intent.ACTION_GET_CONTENT这个Action */
                    intent.setAction(Intent.ACTION_GET_CONTENT);
                    /* 取得相片后返回本画面 需要带回数据  所以开启  */
                    startActivityForResult(intent, MY_PERMISSIONS_REQUEST_PHOTO);
                    dialog.dismiss();
                    break;
                case R.id.paizhao:
                    /**
                     * 点击打开拍照的功能
                     */
                    //判断是否有拍照的权限
                    int checkSelfPermission = ContextCompat.checkSelfPermission(SettingActivity.this, Manifest.permission.CAMERA);
                    //拥有权限 直接打开拍照
                    if (checkSelfPermission == PackageManager.PERMISSION_GRANTED) {
                        takePhoto();
                    } else {
                        //没有权限 需要请求权限
                        ActivityCompat.requestPermissions(SettingActivity.this, new String[]{Manifest.permission.CAMERA},
                                MY_PERMISSIONS_REQUEST_CAMRE);
                    }


                    dialog.dismiss();
                    break;
                case R.id.cancle:
                    dialog.dismiss();
                    break;
            }

        }
    }

    /**
     * 打开照相机
     */
    private void takePhoto() {
        Intent intent;
        Toastutils.showToast("照相");

//        intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        Uri photoUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
//        intent.putExtra("uri", photoUri);
//
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(
//                Environment.getExternalStorageDirectory(), "temp.jpg")));


        intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        Uri photoUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        intent.putExtra("uri", photoUri);

        //  intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(
        //     Environment.getExternalStorageDirectory(), "temp.jpg")));
        startActivityForResult(intent, 1);


        System.out.println("打开照相机");
    }


    /**
     * 点击的相册和照相界面返回的数据
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null) {
            switch (requestCode) {

                case MY_PERMISSIONS_REQUEST_PHOTO:  //相册选择头像
                    try {
                        /**
                         * 把图片传递到到界面
                         */
                        Uri originalUri = data.getData();
                        Bitmap bm = MediaStore.Images.Media.getBitmap(getContentResolver(), originalUri);
                        privateMyTouxiang.setImageBitmap(bm);

                    } catch (Exception e) {
                        throw new RuntimeException("相册异常");

                    }
                    break;
                // TODO: 2016/12/5
                case MY_PERMISSIONS_REQUEST_CAMRE:  //照相机选择头像
                    try {
                        if (data.hasExtra("data")) {

                            Bitmap data1 = data.getParcelableExtra("data");
                            privateMyTouxiang.setImageBitmap(data1);
                        } else {
                            //获得图片的uri
                            Uri uri = data.getData();
                            Bitmap bm = BitmapFactory.decodeStream(getContentResolver().openInputStream(uri));
                            // Bitmap bm = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                            privateMyTouxiang.setImageBitmap(bm);
                            System.out.println("拍照回调3");
                        }
                        System.out.println("拍照回调2");


                    } catch (Exception e) {
                        throw new RuntimeException("拍照异常");
                    }
                    break;

                case SEETINGNAME:  //修改昵称

                    String name = data.getExtras().getString("name");

                    if (!name.equals("")) {
                        privateSettingName.setText(name);

                    }
                    break;
                case ADDADDRESS:
                    String address = data.getExtras().getString("address");
                    privateSettingName.setText(address);
                    break;


            }
        }


    }

    /**
     * 请求权限的返回结果
     *
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == MY_PERMISSIONS_REQUEST_CAMRE) {
            //判断请求的照相权限
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                //用户同意授权
                takePhoto();

            } else {
                //用户拒绝打开照相机
                Toastutils.showToast("拒绝照相机授权");
            }


        }


    }
}