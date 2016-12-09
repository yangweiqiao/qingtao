package com.zhoumai.qingtao.goodslayout;

import android.icu.util.IslamicCalendar;
import android.os.Build;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity implements ISlideCallback {


    private SlideDetailsLayout slidedetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * 布局中是自定义的布局 显示的是两个控件的布局
         */
        setContentView(R.layout.activity_main);

        /**
         * 找到父控件
         */

        slidedetails = (SlideDetailsLayout) findViewById(R.id.slidedetails);

        /**
         * 替换第一个布局为fragment
         */

        FragmentManager fm = getSupportFragmentManager(); //为了兼容使用的support的管理者
// TODO: 2016/12/9 动态的替换布局  这里还没创建布局  new ***fragment();
        fm.beginTransaction().replace(R.id.slidedetails_front, new MyFragment()).commit();

        /**
         * 设置下面的webview控件
         */

/**
 * 找到控件
 */
        final WebView webView = (WebView) findViewById(R.id.slidedetails_behind);
        /**
         * 获取设置
         */
        final WebSettings settings = webView.getSettings();
        /**
         * 设置支持js
         */

        settings.setJavaScriptEnabled(true);
        //设置支持缩放
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
            new Object() {
                public void setLoadWithOverviewMode(boolean overview) {
                    settings.setLoadWithOverviewMode(overview);
                }
            }.setLoadWithOverviewMode(true);
        }


        if (Build.VERSION.SDK_INT >= 19) {
            settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }


//缓存
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);

        getWindow().getDecorView().post(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl("http://139.224.222.130:8882/mobi/product/text?id=2600");

            }
        });


    }

    @Override
    public void openDetails(boolean smooth) {
        slidedetails.smoothOpen(smooth);
    }

    @Override
    public void closeDetails(boolean smooth) {
        slidedetails.smoothClose(smooth);
    }
}
