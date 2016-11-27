package com.zhoumai.qingtao.view.base.application;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.squareup.okhttp.OkHttpClient;
import com.umeng.analytics.MobclickAgent;
import com.zhoumai.qingtao.R;
import com.zhoumai.qingtao.model.Admin;
import com.zhoumai.qingtao.utils.NetUtils;

import java.util.concurrent.TimeUnit;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by 杨伟乔 on 2016/11/21.
 * 配置全局的变量
 */
public class MyApp extends Application {
    static Context context;

    //一个标记
    public static String TAG;

    /**
     * 定义用户对象 用于在登录的时候保存用户对象
     **/
    public static Admin.AdminBean user;

    /**
     * 创建okhttp链接对象
     **/
    public static OkHttpClient okHttpClient;
    /**
     * 指定缓存文件的有效期
     **/
    //根据网络的连接状态指定缓存的有效时间

    public static long cacheFileExpiryDate;

    /**
     * 获取缓存的有效时间 在读取缓存文件的时候调用这个方法 判断缓存文件是否有效
     */
    public static long getCacheFileExpiryDate() {
        return cacheFileExpiryDate;
    }

    /**
     * 获取application对象@return
     */
    public static MyApp instance;

    public static MyApp getInstance() {
        return instance;
    }

    /**
     * 保存当前的用户对象在全局的位置
     */
    public void setCurrentUser(Admin.AdminBean currentUser) {
        this.user = currentUser;
    }


    /**
     * 获取当前的用户对象
     * 判断为空的时候 直接返回null  不为空 返回当前的用户
     */
    public Admin.AdminBean getCurrentUser() {
        Admin.AdminBean currentUser = user;
        if (currentUser != null) {
            return currentUser;
        }
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TAG = this.getClass().getSimpleName();
        //// TODO: 2016/11/27 初始化sdk  初始化第一个参数传当前activity的context对象，第二个参数传ShareSDK的appkey，第二个参数可以省略不传，因为sharesdk.xml已经配置，默认会访问的；
       // 初始化的代码尽量放到调用分享的activity的入口oncreat下就好，尽量不要再application里初始化，也可以多次调用初始化ShareSDK，
       // 初始化ShareSDK必须放到所有调用ShareSDK的最前端。
        ShareSDK.initSDK(this, "sharesdk的appkey");

        //由于Application类本身已经单例，所以直接按以下处理即可。
        instance = this;
        context = getApplicationContext();
        MobclickAgent.openActivityDurationTrack(false); //禁止默认的页面统计方式，这样将不会再自动统计Activity。

        MobclickAgent.enableEncrypt(true);//加密日志的设置
        initImageLoader(getApplicationContext());
        //根据网络的情况指定缓存文件的有效期
        boolean connected = NetUtils.isConnected(this);  //连接状态
        if (connected) {
            cacheFileExpiryDate = 1 * 1000 * 60;  //6分钟
        } else {


        }

    }

    /**
     * 初始化ImageLoader
     */
    public static void initImageLoader(Context context) {
        // 显示相关的配置
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.launch_01)        // 图片正在下载的过程中显示的图片
                .showImageForEmptyUri(R.mipmap.launch_01)    // 如果下载地址是空的显示的默认图片
                .showImageOnFail(R.mipmap.launch_01)            // 下载失败了显示的默认图片
                .cacheInMemory(true)        // 缓存在内容中
                .cacheOnDisk(true)            // 缓存到SD卡
                .considerExifParams(true)    // 参考Exif参数
                // .displayer(new RoundedBitmapDisplayer(20))	// 设置圆角
                .build();


        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(options)        // 默认的显示图片的选项
                .threadPriority(Thread.NORM_PRIORITY - 2)    // 线程的优先级
                .denyCacheImageMultipleSizesInMemory()        // 禁止在内存中缓存图片的多种大小

                .diskCacheFileNameGenerator(new Md5FileNameGenerator())    // 磁盘缓存文件名的生成器
                .tasksProcessingOrder(QueueProcessingType.LIFO)            // 图片下载任务的顺序
//				.writeDebugLogs() // Remove for release app				// 写出调试log
                .build();
        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config);
    }

    /**
     * 获取全局的上下文
     */
    public static Context getContext() {
        return context;
    }

    /**
     * 获取okhttpclient对象
     */
    public static OkHttpClient getOkHttpClient() {
        if (okHttpClient != null) {
            return okHttpClient;
        } else {
            okHttpClient = new OkHttpClient();
            okHttpClient.setConnectTimeout(15, TimeUnit.SECONDS);
            okHttpClient.setReadTimeout(15, TimeUnit.SECONDS);
            return okHttpClient;
        }

    }

}
/**
 * 3.3.1  统计发生次数
 * <p>
 * 在您希望跟踪的代码部分，调用如下方法：
 * <p>
 * MobclickAgent.onEvent(Context context, String eventId);
 * <p>
 * context 指当前的Activity
 * <p>
 * eventId 为当前统计的事件ID。
 * <p>
 * 示例：统计微博应用中"转发"事件发生的次数，那么在转发的函数里调用
 * <p>
 * MobclickAgent.onEvent(mContext,"Forward");
 */