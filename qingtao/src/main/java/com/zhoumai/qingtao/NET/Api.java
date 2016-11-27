package com.zhoumai.qingtao.NET;



/**
 *
 * Created by 杨伟乔 on 2016/11/23.
 */
@SuppressWarnings("unused")
public interface Api {
    /**
     * 登录
     */
    String API_LOGIN = "/mobi/login/wxLogin";


    /**
     * 登陆
     *
     */
    String LOGIN = "/mobi/login/userLogin";
    /**
     *  服务器图片
     */

    String API_IMG = "http://image.qingtaoapp.com";


    /**
     * 爆款推荐分页接口
     */
     String API_RECOMMEND = "/mobi/product/recommend";
    /**
     * 今日特卖分页接口
     */
     String API_SPECIAL_SALE = "/mobi/product/specialSale";
    /**
     * 首页分类
     */
     String API_CATLIST = "/mobi/index/catList";
    /**
     * 分类详情首页
     */
     String API_CAT_DETAIL="/mobi/product/catDetail";
    /**
     * 分类品牌
     */
     String API_CAT_BRAND="/mobi/product/catBrand";
    /**
     * 获取 个人信息
     */
     String API_HOME="/mobi/user/home";
    /**
     * 获取商品详情
     */
     String API_PRO_DETAIL="/mobi/product/proDetail";
    /**
     * 收藏列表
     */
     String API_COLLERT_LIST ="/mobi/collert/list";
    /**
     * 浏览记录
     */
     String API_RECORD_LIST="/mobi/product/viewList";
    /**
     *   取消 或 收藏
     */
     String API_COLLERT_OPERATE="mobi/collert/operate";
    /**
     * 收货地址列表
     */
     String API_ADDRESS_LIST ="/mobi/address/list";
    /**
     *  增加 或  保存地址
     */
    String API_ADDRESS_SAVE = "/mobi/address/save";
    /**
     *  设置默认地址
     */
    String API_ADDRESS_SET_DEFAULT = "/mobi/address/setDefault";
    /**
     *  删除 收货地址
     */
     String API_ADDRESS_DELETE ="/mobi/address/delete";
    /**
     *  查询购物车
     */
     String API_CART_INDEX ="/mobi/cart/list";
    /**
     *  添加到购物车
     */
     String API_CART_ADD ="/mobi/cart/add";
    /**
     *  修改购物车
     */
     String API_CART_EDIT ="/mobi/cart/edit";
    /**
     *  删除 购物车
     */
    String API_CART_DEL ="/mobi/cart/del";

    /**
     *  立即购买
     */
    String API_BUY_NOW ="/mobi/order/create_single";


    /**
     *  团购立即购买
     */
    String API_GROUP_BUY_NOW ="/mobi/group/create";


    /**
     * 获取省
     */
    String GET_PROVINCES="/mobi/address/getProvinces";

    /**
     *  获取市
     */
    String GET_CITYS="/mobi/address/getCitys";

    /**
     *  获取区
     */
    String GET_DISTRICTS="/mobi/address/getDistricts";


    /**
     *  获取粉丝
     */
    String GET_FANS="/mobi/user/fans";

    /**
     * 我的佣金
     */
    String GET_COMMISSION="/mobi/user/commission";

    /**
     * 收益 佣金详情
     */
   String API_USER_COMMISSIONLIST = "/mobi/user/commissionList";


    /**
     * 订单列表
     */
    String GET_ORDERLIST="/mobi/order/list";


    /**
     * 删除订单 取消订单
     */
    String DELETE_ORDER="/mobi/order/delete";



    ///**
    // * 提现发货
    // */
    //String GET_DELETEORDER="/mobi/order/delete";

    /**
     * 确认收货
     */
    String RECEIVE_ORDER="/mobi/order/receive";

    /**
     * 普通订单退款或者退货
     */
    String REFUND_ORDER="/mobi/order/refund";


    /**
     * 添加评论
     */
    String ADD_ORDER_COMMENT="/mobi/order/comment";


    /**
     * 上传图片
     */
    String UP_LOADIMG="/mobi/user/uploadImg";

    /**
     * 结算 生成订单
     */
    String ORDER_CRATE="/mobi/order/crate";
    /**
     * 预支付
     */
    String ORDER_PREPAY="/mobi/order/prePay";

    /**
     * 微信预支付
     */
    String ORDER_WX_PREPAY="/pay/mobiWXPay";

    /**
     * 获取默认地址
     */
    String GET_DEFAULTADDRESS="/mobi/address/getDefault";

    String ORDER_CANCEL="/mobi/order/cancel";
    /**
     * 获取对应广告位的广告，2：首页轮播图广告 3：首页文字公告 4:列表广告
     */
    String ADVERTISEMENT_LIST="/mobi/advertisement/list";


    /**
     * 发送验证码
     */
    String SEND_CODE = "/mobi/user/sendActiveCode";
    /**
     * 注册
     *
     */
    String REGISTER = "/mobi/login/reg";
    /**
     * 我的佣金
     */
    String MY_CAPATAL = "/mobi/user/getCapital";
    /**
     * 提现
     */
    String USER_CASH="/mobi/user/cash";
    /**
     * 优惠券 列表
     */
    String COUPON_LIST = "/mobi/coupon/list";
    /**
     * 今日排行榜
     */
    String RANGKING_TODAY = "/mobi/product/rankingToday";
    /**
     * 提现账号列表
     */
    String ACCOUNT_LIST = "/mobi/account/list";
    /**
     * 修改或新增提现账号
     */
    String ACCOUNT_SAVE = "/mobi/account/save";
    /**
     * 删除提现账户
     */
    String ACCOUNT_DELETE = "/mobi/account/delete";
    /**
     * 查询所有的粉丝
     */
    String FANS_ALL = "/mobi/user/fansAll";

    /**
     * 查询各级的粉丝
     */
    String FANS_LEVEL = "/mobi/user/fans";

    /**
     * 获取二维码 和连接
     */
    String TWO_CODE = "/mobi/user/twoCode";
    /**
     * 顶级分类首页,数据包含分类下的所有品牌，所有子分类
     */
    String PROLIST_INDEX = "/mobi/product/proListIndex";
    /**
     *根据分类id返回产品列表，分页
     *
     */
    String PRO_LIST = "/mobi/product/proList";
    /**
     * 产品评论列表
     */
    String PRO_CONMENTS="/mobi/comment/proComents";
    /**
     * 批量添加评论
     */
    String MAKE_COMMENTS="/mobi/comment/addComments";
    /**
     * 获取圈子列表
     */
    String POST_LIST="/mobi/post/getPostList";
    /**
     * 获取帖子详情
     */
    String POST_DETAIL = "/mobi/post/getPostDetail";
    /**
     * 获取点赞集合
     */
    String FAV_LIST="/mobi/post/getFavList";
    /**
     * 获取 评论集合
     */
    String COMMONT_LIST ="/mobi/post/getCommentList";
    /**
     * 发布帖子
     */
    String ADD_POST = "/mobi/post/addPost";
    /**
     * 关注 返回1 关注  0 取消关注
     */
    String ADD_FOLLOW="/mobi/post/addFollow";
    /**
     * 点赞 返回1 点赞 0 取消点赞
     */
    String ADD_FAV ="/mobi/post/addFav";
    /**
     * 添加评论
     */
    String ADD_COMMENT = "/mobi/post/addComment";

    /**
     * 团购列表
     */
    String GROUB_LIST = "/mobi/group/groupList";
    /**
     * 团购详情
     */
    String GROUB_DETAIL = "/mobi/group/groupDetail";
    /**
     * 忘记密码 第一步
     */
    String FOREGT_PWD = "/mobi/login/forgetPassword1";
    /**
     * 忘记密码 2
     */
    String FORGET_PWD_TWO = "/mobi/login/forgetPassword2";
    /**
     * 忘记密码 2
     */
    String API_UPDATE_PWD="/mobi/login/updatePassword";
    /**
     * 限时购列表
     */
    String PERIOD_LIST = "/mobi/limit/getPeriodList";
    /**
     * 限时购商品列表
     */
    String PERIOD_PRO_LIST = "/mobi/limit/getProList";
    /**
     * 修改个人信息
     */
    String USERT_UPDATEINFO = "/mobi/user/updateInfo";
    /**
     * 更换手机号
     */
    String CHG_PHONE = "/mobi/user/chgPhone";
    /**
     * 显示首页三个类商品展示
     */
    String INDEX_FIRSTPROS="/mobi/product/indexFirstPros";


    /**
     * 品牌列表
     */
    String BRAND_INDEX = "mobi/product/allBrand";

    /**
     * 签到列表
     */
    String SIGN_LIST = "mobi/sign/list";

    /**
     * 签到接口
     */
    String SIGN = "mobi/sign/sign";

    /**
     * 生成订单
     */
    String CREATE_ORDER = "/mobi/order/confrim";

    /**
     * 生成团购订单
     */
    String CREATE_GROUP_ORDER = "/mobi/group/confirm";

    /**
     * 浏览记录
     */
    String VIEW_RECORD = "get/mobi/record/list";

    /**
     * 加入团购
     */
    String JOIN_GROUP_BUY = "mobi/group/joinGroup";

    /**
     * 发起团购
     */
    String START_GROUP_BUY = "mobi/group/startGroup";

    /**
     * 首页资讯列表
     */
    String INDEX_LIST  = "mobi/info/list";

    /**
     * 检查更新
     */
    String CHECK_UPDATE = "mobile/core/apk/getApkInfo";

    /**
     * 查询申请状态
     */
    String CHECK_APPLY = "/mobi/user/checkApplyStatus";

    /**
     * 申请经销商/代理商
     */
    String APPLY_AGENT= "/mobi/user/apply";

    /**
     * 查询代理商/服务商缴费信息
     */
    String AGENT_FEE= "/mobi/user/renew";

    /**
     * 经销商，代理商支付，续费，生成订单
     */
    String AGENT_ORDER_CREAT= "/mobi/order/toCreate";

    /**
     * 获得品牌信息
     */
    String GET_BRAND_INFO= "/mobi/product/brandInfo";

    /**
     * 首页资讯分类
     */
    String GET_INDEX_PORTAL="/mobi/index/indexPortals";

    /**
     * 提现列表
     */
    String CASH_LIST="/mobi/user/cashList";

    /**
     * 提现详情
     */
    String CASH_DETAIL="/mobi/user/cashDetai";

    /**
     * 订单退货填单
     */
    String RETURN_INFO="/mobi/order/returnInfo";


    String FANS_ALL_NUM ="/mobi/user/fansAll" ;
}
