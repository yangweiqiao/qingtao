//package com.zhoumai.qingtao.wxapi;
//
//import android.app.Activity;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AlertDialog;
//
////import com.sunday.common.logger.Logger;
////import com.sunday.qingtao.common.AppConst;
//import com.tencent.mm.sdk.constants.ConstantsAPI;
//import com.tencent.mm.sdk.modelbase.BaseReq;
//import com.tencent.mm.sdk.modelbase.BaseResp;
//import com.tencent.mm.sdk.openapi.IWXAPI;
//import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
//import com.tencent.mm.sdk.openapi.WXAPIFactory;
//
///**
// * Created by 刘涛 on 2016/6/7.
// */
//public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler{
//    private IWXAPI api;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        api= WXAPIFactory.createWXAPI(this, AppConst.APP_ID);
//        api.handleIntent(getIntent(),this);
//    }
//
//    @Override
//    protected void onNewIntent(Intent intent) {
//        super.onNewIntent(intent);
//        setIntent(intent);
//        api.handleIntent(intent, this);
//    }
//
//    @Override
//    public void onReq(BaseReq baseReq) {
//
//    }
//
//    @Override
//    public void onResp(BaseResp resp) {
//        final String TAG=WXPayEntryActivity.class.getSimpleName();
//        Logger.d(TAG,"onPayFinish,errCode="+resp.errCode);
//        if (resp.getType() == ConstantsAPI.COMMAND_PAY_BY_WX) {
//            if(resp.errCode==0){
//				/*AlertDialog.Builder builder = new AlertDialog.Builder(this);
//				builder.setTitle("提示");
//				builder.setMessage("付款成功");
//				builder.show();*/
////                EventBus.getDefault().post(new PaySuccess());
////                finish();
//
//            }else{
//                AlertDialog.Builder builder = new AlertDialog.Builder(this);
//                builder.setTitle("提示");
//                builder.setMessage("付款失败");
//                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                    }
//                });
//                builder.show();
//            }
//
//        }
//    }
//
//
//}
