package com.zhoumai.qingtao.NET;


import android.os.AsyncTask;
import android.text.TextUtils;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.zhoumai.qingtao.utils.T;
import com.zhoumai.qingtao.view.base.application.MyApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;




/**
 * 请求数据
 *
 * @author yangweiqiao
 */
@SuppressWarnings("unused")
public class NetUtils {


    private static final String HOSTURL = "http://139.224.222.130:8882/";

    /**
     * 请求数据示例:
     * http://192.168.1.100:8080/oschina/list/news/page0.xml
     *
     * @param catalog  第一个参数 分类 代表当前请求数据的接口
     * @param map      传进来post请求的参数 如果是get请求 直接传入null
     * @param listener 第三个参数  网络请求的接口回调 会返回请求的数据 字符串形式返回数据
     *                 这个方法请求到数据之后,解析数据 调用方法  示例: NewsList newsList = XmlUtil.toBean(NewsList.class, xml);
     * @param isCache  是否需要缓存数据
     */

    public static void requestData(final String catalog, final HashMap<String, Object> map, final onRequestDataFinish listener, Boolean isCache) {

        /**
         * 判断是否做缓存
         * */
        if (isCache) {
            /** 做缓存  */
         /*
         * 创建url缓存地址
         */
            final String cacheFileName = creatCacheFileName(catalog, map);
             /*
         * 判断是否有缓存文件
         */

            File cacheFile = getCacheFile(cacheFileName);

           /*
           判断缓存是否有效
            */

            boolean isused = isUsed(cacheFile);

            if (isused) {
                /**
                 * 从缓存文件中读取数据
                 */

                getDataFromCache(catalog,cacheFile, listener);
            } else {



                new Thread()
                {
                    public void run()
                    {
                        //访问网络代码
                        getDataFromNet(cacheFileName, catalog, map, listener);
                    }
                }.start();

            }

        } else {
            /** 数据不需要缓存  */
            /**
             * 从网络中请求数据 缓存数据
             */

            new Thread()
            {
                public void run()
                {
                    //访问网络代码
                    getDataFromNet(null, catalog, map, listener);
                }
            }.start();


        }


    }

    /**
     * 创建缓存文件的名称
     *
     * @param catalog 类型
     * @param values  参数
     * @return 拼接完成的文件名称
     */
    private static String creatCacheFileName(String catalog, HashMap values) {

        /**根据传入进来的参数创建缓存文件名字*/
        return catalog + values.toString();
    }

    /**
     * 获取缓存文件
     *
     * @param   cacheFileName  根据文件名字去获取文件
     * @return file
     *
     */
    private static File getCacheFile(String cacheFileName) {

        try {
            // 进行编码
            cacheFileName = URLEncoder.encode(cacheFileName, "utf-8");

            return    new File(MyApp.getContext().getCacheDir(), cacheFileName);



        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    /**
     * 判断缓存文件是否有效
     *
     * @param cacheFile 缓存的文件
     * @return boolean
     */
    private static boolean isUsed(File cacheFile) {

        //判断缓存文件是否有效,

        /*
        1.首先判断文件是否为null 或者是不存在的
         */
        if (cacheFile == null || !cacheFile.exists()) {
            //条件满足一个 就返回false

            return false; //文件不存在
        }
        /*
         2. 判断文件存在的情况
		 */
        //定义文件的有效
        /*
         TODO  这里定义的是缓存文件的有效时间
          */
        long isUsedTime = MyApp.getCacheFileExpiryDate();
        /** 获取文件最后的修改时间 */
        long modified = cacheFile.lastModified();
        /** 获取系统的当前的时间 */
        long millis = System.currentTimeMillis();
        /** 计算系统当前的时间和文件最后修改时间的差值 */
        long times = millis - modified;
        /** 如果有效时间 大于 差值 返回true 证明文件有效 */
        return isUsedTime > times;


    }

    /**
     * 从缓存文件中获取数据
     *
     * @param cacheFile 缓存文件
     * @param listener 获取数据后实现接口然后可以获取数据
     */
    private static void getDataFromCache(final String catalog, final File cacheFile, final onRequestDataFinish listener) {


        //读取缓存文件
        new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground(Void... params) {
                BufferedReader reader    ;

                try {
                    reader = new BufferedReader(new FileReader(cacheFile));

                    String line;
                    StringBuilder sb = new StringBuilder();
                    try {
                        while ((line = reader.readLine()) != null) {

                            sb.append(line).append("\n");
                        }
                        String json = sb.toString();
                        reader.close();
                        return json;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                return null;
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                //这里的参数是上面的那个方法返回的数据
//                String json = result;

                //把数据传递给调用者
                listener.requestdataFinish(catalog, result);
            }

        }.execute();


    }

    /**
     * 从网络获取数据
     *
     *
     * @param cacheFileName  缓存文件名称
     * @param catalog  地址接口
     * @param map  参数
     * @param listener  监听接口
     */
    private static void getDataFromNet(final String cacheFileName, final String catalog, final HashMap map, final onRequestDataFinish listener) {

//这里的方法没有添加
        OkHttpClient okHttpClient=   new OkHttpClient();

        /**
         * 设置链接超时
         */
        okHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(10, TimeUnit.SECONDS);


        /**
         * 判斷請求的方式
         */
        if(map==null){
            final Request request = new Request.Builder()
                    .url(HOSTURL+catalog)
                    .build();
//new call
            okHttpClient.newCall(request)
.enqueue(new Callback()
            {
                @Override
                public void onFailure(Request request, IOException e)
                {

                    listener.requestdataFinish(catalog,null);
                }

                @Override
                public void onResponse(final Response response) throws IOException
                {
                    String string = response.body().string();
                    listener.requestdataFinish(catalog,string);
                    /**
                     * 请求完数据之后 做数据的缓存判断
                     */

                    if (null != cacheFileName) { //判断需要缓存的文件名字
                        /**需要缓存 */
                        cacheData(string, catalog);
                    }

                }
            });







        }else{

/**以自己的方式创建请求体**/
            FormEncodingBuilder builder = new FormEncodingBuilder();
            Set<String> set = map.keySet();

            for (String key : set) {

                builder.add(key, String.valueOf(map.get(key)));
                System.out.println("测试服务器的数据:"+key+"values"+map.get(key));
            }


            RequestBody requestBody = builder.build();




            System.out.println(HOSTURL + catalog +"    ===========");
            Request request = new Request.Builder()
                    .url(HOSTURL + catalog) //catalog 参数是传入的界面类型
                    .post(requestBody)
//                .addHeader("token", "helloworldhelloworldhelloworld") 这里不需要添加请求头
                    .build();




            try {
                Response response = okHttpClient.newCall(request).execute();
                if (response.isSuccessful()) {
                    String message = response.message();
                    Response response1 = response.networkResponse();
                    String json = response.body().string();
                    listener.requestdataFinish(catalog,json);
                    /**
                     * 请求完数据之后 做数据的缓存判断
                     */

                    if (null != cacheFileName) { //判断需要缓存的文件名字
                        /**需要缓存 */
                        cacheData(json, catalog);
                    }

                } else  {
                    //网络请求失败
                    T.showToast("没网你就知道幸福远了!");
                    listener.requestdataFinish(catalog,null);
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("联网请求catalog数据发生异常----------" + e);
            }
        }









    }
    /**
     * 缓存数据 参数是 xml字符串
     *
     * @param result json数据缓存
     * @param fileName 文件名称
     */
    private static void cacheData(String result, String fileName) {
        if (TextUtils.isEmpty(result)) {
            //如果 数据为空,返回,不再继续缓存
            return;
        }

        //根据url获取
        File cacheFile = getCacheFile(fileName);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(cacheFile));
            writer.write(result);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {


        }


    }


}
