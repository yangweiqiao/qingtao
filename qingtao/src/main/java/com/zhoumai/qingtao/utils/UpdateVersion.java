package com.zhoumai.qingtao.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.zhoumai.qingtao.JavaBean.UpdateInfo;
import com.zhoumai.qingtao.NET.*;
import com.zhoumai.qingtao.view.base.application.MyApp;

import java.io.File;
import java.util.HashMap;

/**
 * Created by ${杨伟乔} on 2016/12/5.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class UpdateVersion implements onRequestDataFinish {
    int versionCode;
    String versionName;
    String downLoadUrl;


    private static final int REQUEST_CODE_INSTALL = 130;


    protected static final int SHOW_UPDATE_DIALOG = 101;
    protected static final int ENTER_HOME = 102;
    protected static final int RETRUE_DATA_FAILTURE = 103;
    protected static final int NET_ERROR = 104;
    private Activity activity;
    private Class nextactivity;

    public void update(Activity activity,Class nextactivity) {

        this.activity = activity;
        this.nextactivity = nextactivity;
        /**
         * 检查版本是否更新  根据是否联网的状态
         */
        boolean connected = com.zhoumai.qingtao.utils.NetUtils.isConnected(MyApp.getContext());
        if (!connected){
            Toastutils.showToast("没有网络,感觉幸福离你远去了!");
            return;
        }
        //首先获取当前应用的版本号
        versionName = AppUtils.getVersionName(MyApp.getContext());
        versionCode = AppUtils.getVersionCode(MyApp.getContext());


        HashMap<String, Object> map = new HashMap<>();
        map.put("versionCode", versionCode);
        map.put("type", 1);

      //  com.zhoumai.qingtao.NET.NetUtils.requestData(Api.CHECK_UPDATE, map, this, false);
    }


//    @Override
//    public void requestdataFinish(String catalog, String json) {
//        //数据请求成功 判断有没有新的版本
//        UpdateInfo updateInfo = JsonUtil.parseJsonToBean(json, UpdateInfo.class);
//        if (updateInfo.getCode() == 0) {
//            final Message msg = Message.obtain();
//            int newVersionCode = updateInfo.getNewAppInfo().getVersionCode();
//            if (newVersionCode != versionCode) {
//
//                //提示用户更新
//                downLoadUrl = updateInfo.getNewAppInfo().getDownLoadUrl();
//                msg.what = SHOW_UPDATE_DIALOG;
//                handler.sendMessage(msg);
//            } else {
//
//                msg.what = ENTER_HOME;
//                handler.sendMessage(msg);
//            }
//
//        }
//    }



    /**
     * 弹出是否升级的对话框
     */
    private void showUpdateDialog() {


        AlertDialog.Builder builder = new  AlertDialog.Builder(activity );



        builder.setTitle("发现新的版本");

        builder.setMessage("新的版本描述信息");

// 禁止取消
        // builder.setCancelable(false);//不升级不让用
        /**
         * 点击确定按钮后立即升级 调用下载apk的方法
         */
        builder.setPositiveButton("立即升级", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 下载apk
                Log.e("立即升级", "下载apk");
                downloadApk();
            }
        });
        /**
         * 取消按钮点击后
         */
        builder.setNegativeButton("稍后再说", new DialogInterface.OnClickListener() {
            // dialog 当前对话框
            // which 选项的下标
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // 进入主界面
                Log.e("稍后再说", "进入主界面");
                enterActivity();
            }
        });
        /**
         * 添加取消监听器 点击对话框以外的区域
         */
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            /**
             * 取消时调用这个方法 dialog 当前对话框
             */
            @Override
            public void onCancel(DialogInterface dialog) {
                // 进入主界面
                enterActivity();
            }
        });
        builder.show();

    }

    @Override
    public void requestdataFinish(String catalog, Object bean) {

    }

    @Override
    public void requestdataFailed() {
        //数据请求失败 直接进入主界面
        System.out.println("网络请求失败");
        enterActivity();
    }


    private void enterActivity() {
        //创建意图


        activity.startActivity(new Intent(activity , nextactivity));//显示主窗口

    }





    protected void downloadApk() {
        // xUtils
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {//检查sd卡是否可用
            HttpUtils http = new HttpUtils();
            final ProgressDialog dialog = new ProgressDialog(activity);//创建一个进度条对话框
            dialog.setTitle("正在下载");//设置标题
            dialog.setCanceledOnTouchOutside(false);
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialogInterface) {
                    enterActivity();
                }
            });
            dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);//设置样式
            String target = Environment.getExternalStorageDirectory() + "/qingtao.apk";//获取文件存放的目录
            http.download(downLoadUrl, target, new RequestCallBack<File>() {
                private ResponseInfo<File> responseInfo; //调用方法DownLoad()  参数 下载地址 目标地址  接口回调

                // 开始时的回调
                @Override
                public void onStart() {
                    super.onStart();
                    dialog.show();//显示进度条
                }

                // 下载中的回调
                @Override
                public void onLoading(long total, long current, boolean isUploading) {//参数 总大小 当前大小 是否在下载
                    super.onLoading(total, current, isUploading);
                    dialog.setMax((int) total);
                    dialog.setProgress((int) current);
                }

                @Override
                public void onSuccess(ResponseInfo<File> responseInfo) {
                    // 参数 responseInfo 中封装了下载的文件信息
                    System.out.println("length: " + responseInfo.contentLength);
                    dialog.dismiss();
                    // 下载成功, 安装apk 调用安装app的方法
                    installApk(responseInfo.result);
                }

                @Override
                public void onFailure(HttpException error, String msg) {
                    // 打印一下错误日志

                    System.out.println(error);
                    dialog.dismiss();
                }


            });
        } else {
            Toast.makeText(activity, "SD卡不可用", Toast.LENGTH_SHORT).show();
        }
    }




    protected void installApk(File file) {//参数 下载的apk文件
        // 使用隐式意图, 调用系统应用 Package Installer, 让它帮我们安装. (静默安装, ROOT)
        // <intent-filter>
        // <action android:name="android.intent.action.VIEW" />
        // <category android:name="android.intent.category.DEFAULT" />
        // <data android:scheme="content" />
        // <data android:scheme="file" />
        // <data android:mimeType="application/vnd.android.package-archive" />
        // </intent-filter>
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
       activity. startActivityForResult(intent, REQUEST_CODE_INSTALL);
    }






    private Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_UPDATE_DIALOG: // 弹出是否升级的对话框
                    showUpdateDialog();
                    break;

                case ENTER_HOME: // 进入主界面
                    enterActivity();
                    break;

                case RETRUE_DATA_FAILTURE: // 进入主界面

                    enterActivity();
                    break;

                case NET_ERROR: // 弹出toast，进入主界面

                    enterActivity();
                    break;
            }
        };
    };




}
