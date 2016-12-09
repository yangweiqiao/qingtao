package com.zhoumai.qingtao.wxapi;

import android.app.Activity;
import android.os.Bundle;

import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.modelmsg.SendAuth;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.zhoumai.qingtao.utils.Toastutils;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;

/**
 * Created by ${杨伟乔} on 2016/12/9.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {


    private IWXAPI wxapi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        wxapi = WXAPIFactory.createWXAPI(this, "wx3ce7ac661982858e");
        wxapi.handleIntent(getIntent(), this);
    }

    @Override
    public void onReq(BaseReq baseReq) {

    }

    @Override
    public void onResp(BaseResp resp) {


        if (resp instanceof SendAuth.Resp) {


            SendAuth.Resp resp1 = (SendAuth.Resp) resp;

            String code = resp1.code;
            System.out.println("code:"+code);

            String s = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";




        }


    }
}
