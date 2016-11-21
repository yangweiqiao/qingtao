package com.zhoumai.qingtao.http;


import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.Toast;


import com.squareup.okhttp.internal.http.HttpMethod;
import com.zhoumai.qingtao.base.baseapplication.MyApp;
import com.zhoumai.qingtao.interf.onRequestDataFinish;
import com.zhoumai.qingtao.utils.SpUtils;

import org.xutils.ex.HttpException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 请求数据
 * 从sp  获取url  可以 "baseurl"
 *
 * @author yangweiqiao
 */
public class NetUtils {

    private static String fileName;

    /**
     * 请求数据示例:
     * http://192.168.1.100:8080/oschina/list/news/page0.xml
     *
     * @param catalog  第一个参数 代表当前请求数据的类型  //news  (string类型)
     * @param values   第二个参数 代表当前的页数 如果没有页数 第二个参数任意写 //String类型
     * @param listener 第三个参数  网络请求的接口回调 会返回请求的数据 字符串形式返回数据
     *                 这个方法请求到数据之后,解析数据 调用方法  示例: NewsList newsList = XmlUtil.toBean(NewsList.class, xml);
     */

    public static void requestData(String catalog, String values, onRequestDataFinish listener) {
        /**
         * 创建url地址
         *
         */
        String url = creatURL(catalog, values);
        /**
         * 判断是否有缓存文件
         */

        File cacheFile = getCacheFile(catalog + values);


        /**
         * 判断缓存文件是否有效
         */

        boolean isused = isUsed(cacheFile);
        if (isused) {
            /**
             * 从缓存文件中读取数据
             */

            getDataFromCache(catalog, cacheFile, listener);

        } else {

            /**
             * 从网络中请求数据 缓存数据
             */
            getDataFromNet(catalog, url, listener);

        }

    }

    /**
     * 创建url地址
     *
     * @param catalog 类型
     * @param values  参数
     * @return 拼接完成的url地址
     */
    private static String creatURL(String catalog, String values) {
        String url = null;
        //http://192.168.1.100:8080/oschina/list/message_list/page0.xml
//        首先从sp中 获取baseurl http://192.168.1.100:8080/oschina


        String baseurl = SpUtils.getString("baseurl");


        if (TextUtils.isEmpty(baseurl)) {
            Toast.makeText(MyApp.getContext(), "先输入本地的主机地址", Toast.LENGTH_SHORT).show();
            return null;
        }
        //咨询         list/news/page0.xml
        switch (catalog) {


            case "news":

                //咨询         list/news/page0.xml
                url = baseurl + "/list/news/page" + values + ".xml";
                break;
            case "hotspot":
                //热点   list/hotspot/page0.xml
                url = baseurl + "/list/hotspot/page" + values + ".xml";

                break;

            case "blog":
                //博客         list/blog/page0.xml
                url = baseurl + "/list/blog/page" + values + ".xml";
                break;
            case "recommend":
                //推荐        list/recommend/page0.xml
                url = baseurl + "/list/recommend/page" + values + ".xml";

                break;
            case "news_detail":
                //咨询热点详情  detail/news_detail/64198.xml
                url = baseurl + "/detail/news_detail/" + values + ".xml";
                break;
            case "blog_detail":
                url = baseurl + "/detail/blog_detail/" + values + ".xml";
                //博客推荐详情  detail/blog_detail/470948.xml
                break;
            case "tweet_list":
                url = baseurl + "/list/tweet_list/page" + values + ".xml";
                //动弹         list/tweet_list/page0.xml
                break;
            case "hottweet":
                url = baseurl + "/list/hottweet/page/" + values + ".xml";
                //热门动弹     list/hottweet/page0.xml
                break;

            case "mytweet":

                url = baseurl + "/list/mytweet/page/" + values + ".xml";
                //我的动弹     list/mytweet/page0.xml

                break;
            case "tweet_detail":
                url = baseurl + "/detail/tweet_detail/" + values + ".xml";
                //动弹详情     detail/tweet_detail/6066159.xml
                break;
            case "commentlist":
                url = baseurl + "/commentlist/catalog3id6066159page" + values + ".xml";
                //评论         commentlist/catalog3id6066159page0.xml
                break;
            case "active_list1"://active_list1   /list/active_list1/page0.xml
                url = baseurl + "/list/active_list1/page" + values + ".xml";
                //好友圈       list/active_list1/page0.xml
                break;
            case "event_list":
                url = baseurl + "/list/event_list/page" + values + ".xml";
                // 活动        list/event_list/page0.xml
                break;
            case "my_event_list":
                url = baseurl + "/list/my_event_list/page" + values + ".xml";
                //我的活动     list/my_event_list/page0.xml
                break;
            case "post_detail":

                url = baseurl + "/detail/post_detail/" + values + ".xml";
                //活动详情     detail/post_detail/243072.xml
                break;
            case "my_information":
                url = baseurl + "/information/my_information.xml";
                //我

                break;

            case "active_list2":
                url = baseurl + "/list/active_list2/page" + values + ".xml";
                //@我

                break;
            case "active_list3":
                url = baseurl + "/list/active_list3/page" + values + ".xml";
                //评论我

                break;

            case "message_list":
                url = baseurl + "/list/message_list/page" + values + ".xml";
                //留言

                break;

            case "friends_list0":
                url = baseurl + "/list/friends_list0/page" + values + ".xml";
                //粉丝

                break;
            case "my_tweet_like_list":
                url = baseurl + "/list/friends_list0/page.xml";
                //赞过我

                break;

            case "userblog_list":
                url = baseurl + "/list/userblog_list/page" + values + ".xml";
                //博客

                break;

        }
        return url;
    }

    /**
     * 获取缓存文件
     *
     * @param //url 根据url地址去获取文件
     * @return
     */
    private static File getCacheFile(String catalog) {

        try {
            //根据url为文件名去查询 ,首先把url进行编码

            // fileName = URLEncoder.encode(url,"utf-8");
            fileName = catalog;
            File file = new File(MyApp.getContext().getCacheDir(), fileName);

            return file;

        } catch (Exception e) {

            e.printStackTrace();
        }

        return null;
    }

    /**
     * 判断缓存文件是否有效
     *
     * @param cacheFile 缓存的文件
     * @return
     */
    private static boolean isUsed(File cacheFile) {

        //判断缓存文件是否有效,首先判断文件是否为null 或者是不存在的
        if (cacheFile == null || !cacheFile.exists()) {
            //条件满足一个 就返回false

            return false;
        }
        /*
         * 判断文件存在的情况
		 */


        //定义文件的有效
        long time = 1 * 60 * 1000; //3分钟

        //获取文件最后的修改时间
        long modified = cacheFile.lastModified();
        //获取系统的当前的时间
        long millis = System.currentTimeMillis();
        //计算系统当前的时间和文件最后修改时间的差值
        long times = millis - modified;
        //如果有效时间 大于 差值 返回true 证明文件有效
        return time > times;
    }

    /**
     * 从缓存文件中获取数据
     *
     * @param catalog
     * @param cacheFile 缓存文件
     * @param listener
     */
    private static void getDataFromCache(String catalog, final File cacheFile, final onRequestDataFinish listener) {


        //读取缓存文件
        new AsyncTask<Void, Void, String>() {

            @Override
            protected String doInBackground(Void... params) {
                BufferedReader reader = null;

                try {
                    reader = new BufferedReader(new FileReader(cacheFile));

                    String line;
                    StringBuffer sb = new StringBuffer();
                    try {
                        while ((line = reader.readLine()) != null) {

                            sb.append(line).append("\n");

                        }


                        String xml = sb.toString();


                        reader.close();
                        return xml;
                    } catch (IOException e) {
                        e.printStackTrace();

                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } finally {

                }

                return null;
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                //这里的参数是上面的那个方法返回的数据
                String xml = result;

                //把数据传递给调用者
                listener.requestdataFinish(xml);
            }

        }.execute();


    }

    /**
     * 从网络获取数据
     *
     * @param catalog
     * @param url      请求地址
     * @param listener
     */
    private static void getDataFromNet(final String catalog, final String url, final onRequestDataFinish listener) {

        //url = "http://192.168.80.25:8080/oschina/list/news/page0.xml";
        if (url == null) {

            listener.requestdataFinish(null);
            Toast.makeText(MyApp.getContext(), "请设置主机地址 ", Toast.LENGTH_SHORT).show();
            return;
        }


        HttpUtils http = new HttpUtils();


        http.send(HttpMethod.GET, url, new RequestCallBack<String>() {
            @Override
            public void onSuccess(ResponseInfo<String> responseInfo) {

                String xml = responseInfo.result;

                listener.requestdataFinish(xml);

//                需要缓存数据
                cacheData(xml, catalog);
            }

            @Override
            public void onFailure(HttpException error, String msg) {


                listener.requestdataFailed();

            }
        });

    }


    /**
     * 缓存数据 参数是 xml字符串
     *
     * @param result
     * @param fileName
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
