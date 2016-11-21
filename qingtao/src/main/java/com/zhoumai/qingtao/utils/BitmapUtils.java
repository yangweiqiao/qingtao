package com.zhoumai.qingtao.utils;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yangweiqiao on 2016/8/24.
 *
 *
 * 位图加载工具类
 * 三个方法  :从指定位置 获取按指定比例加载的位图
 *           从指定位置 按照宽高比例加载位图
 *           将图片保存到指定的位置
 * @author LiBing
 *
 */

public class BitmapUtils {
        /**
         * 从指定路径，按指定收缩比例加载位图
         *
         * @param path
         * @param scale
         * @return
         */
        public static Bitmap getBitmap(String path, int scale) {
            Bitmap bm = null;
            if (path != null) {
                Options opts = new Options();
                opts.inSampleSize = scale;
                bm = BitmapFactory.decodeFile(path, opts);
            }
            return bm;
        }
        /**
         * 从指定路径，按指定宽高比例加载位图
         *
         * @param path
         * @param width
         * @param height
         * @return
         */
        public static Bitmap getBitmap(String path, int width, int height) {
            Bitmap bm = null;
            if (path != null) {
                Options opts = new Options();
                // 只加载边界信息
                opts.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(path, opts);
                // 计算收缩比例
                int x = opts.outWidth / width;
                int y = opts.outHeight / height;
                opts.inSampleSize = x > y ? x : y;
                // 加载全部数据
                opts.inJustDecodeBounds = false;
                bm = BitmapFactory.decodeFile(path, opts);
            }
            return bm;
        }

        /**
         * 将位图保存到指定路径
         *
         * @param bm
         * @param path
         */
        public static String save(Bitmap bm, String path) {
            File file = null;
            if (bm != null && path != null) {
                file = new File(path);
                // 如果父目录不存在，创建父目录
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                try {
                    if (!file.exists()) {
                        try {
                            file.createNewFile();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    FileOutputStream out = new FileOutputStream(file);
                    // 获取拓展名
                    String filename = file.getName();
                    String ext = filename.substring(filename.lastIndexOf(".") + 1,
                            filename.length());
                    if ("jpg".equalsIgnoreCase(ext) || "jpeg".equalsIgnoreCase(ext)) {
                        bm.compress(CompressFormat.JPEG, 100, out);
                    } else {
                        bm.compress(CompressFormat.PNG, 100, out);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            return file.getAbsolutePath();
        }

    }


