package com.zhoumai.qingtao.base.baseapplication;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.zhoumai.qingtao.R;

/**
 * Created by Administrator on 2016/11/21.
 */
public class MyApp  extends Application{
   static  Context context;

    public static String IS_FRIST="is_frist";

    @Override
    public void onCreate() {
        super.onCreate();
      this.context  =this;
        initImageLoader(getApplicationContext());
    }

    /** 初始化ImageLoader */
    public static void initImageLoader(Context context) {
        // 显示相关的配置
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.launch_01)		// 图片正在下载的过程中显示的图片
                .showImageForEmptyUri(R.mipmap.launch_01)	// 如果下载地址是空的显示的默认图片
                .showImageOnFail(R.mipmap.launch_01)			// 下载失败了显示的默认图片
                .cacheInMemory(true)		// 缓存在内容中
                .cacheOnDisk(true)			// 缓存到SD卡
                .considerExifParams(true)	// 参考Exif参数
                // .displayer(new RoundedBitmapDisplayer(20))	// 设置圆角
                .build();


        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(options)		// 默认的显示图片的选项
                .threadPriority(Thread.NORM_PRIORITY - 2)	// 线程的优先级
                .denyCacheImageMultipleSizesInMemory()		// 禁止在内存中缓存图片的多种大小

                .diskCacheFileNameGenerator(new Md5FileNameGenerator())	// 磁盘缓存文件名的生成器
                .tasksProcessingOrder(QueueProcessingType.LIFO)			// 图片下载任务的顺序
//				.writeDebugLogs() // Remove for release app				// 写出调试log
                .build();
        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config);
    }

    public static Context getContext() {
        return context;
    }
}
