package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by ${张科} on 2016/4/6.
 */
public class AdminUser implements Serializable {





    private String id;

    private String username;  //登陆用户名

    private String password;  //登陆密码

    private String name;       //真是姓名

    private String nickName;    //昵称或者店铺名字   ------普通用户昵称，供货商店铺名字，这里没有店铺的实体

    private String mobi;//电话

    private String enamil;//邮箱

    private String loginIp;//最后登入IP

    private long loginTime;//最后登入时间

    private Integer status;//状态 1有效 0冻结

    private Integer sex;//性别:1.男 2.女

    private String birthday;//生日

    private String area;//地区  省市县ID的拼装  格式： 省-市-县

    private String bigLogo;//大头像

    private String middleLogo;//小头像

    private String logo;//最小头像
    private String identityCard; //身份证卡号
    private String identityCardOne; //身份证正面
    private String identityCardTwo; //身份证反面
    private Integer isDeleted;//逻辑删除标记 0有效 1删除
    private Integer isPay;//0:未付款，1：已经付款

    private Integer type;  //用户类型  0：  1：超级管理员，平台管理员  2：供应商  3：经销商 4：门店    100：普通用户
    private Long supplierId; //供应商id --- 代理商和门店有
    private Long agentId; //代理商id ------门店有
    private Long recommendId; //推荐人id
    private String fullPath;//推荐人全组织全路径
    private Long parentId;   //上级id
    /**
     * 微信信息
     */

    private String openId;   //微信openId
    private String unionId;   //微信开放平台用户唯一id



    private Long provinceId;//省
    private Long districtId;//区县
    private Long cityId;//市
    private Long shopId;//店铺id   --门店

    private Integer isAllowM;  //是否允许修改服务费和保证金  0:不允许   1：允许
    /*
     * 如果是供货商， supServiceCharge，supCashDeposit表示成为大B的服务费和保证金
     * 如果是 大B, ageServiceCharge，ageCashDeposit表示成为小b的服务费和保证金
     */
    private Double ageServiceCharge;  //成为大B默认服务费   当isAllowM=1时有效
    private Double ageCashDeposit; //成为大B默认保证金  当isAllowM=1时有效
    private Double shoServiceCharge;  //成为小b默认服务费   当isAllowM=1时有效
    private Double shoCashDeposit; //成为小b默认保证金  当isAllowM=1时有效


    private Integer maximumRecommend; //发展下级最大数量
    private String dueTime; //账号结束时间
    private Double minAgeServiceCharge; //成为大B最低服务费，超级管理员有
    private Double minShoServiceCharge; //成为小b最低服务费，超级管理员有



    /*
     * 大B推广佣金和服务费非配比例   管理员和供货商使用
     * AgeRecomOne + AgeRecomTwo +AgeRecomThr = 100
     */
    private Integer ageRecomOne; //平台
    private Integer ageRecomTwo; //供货商
    private Integer ageRecomThr;  //代理商，推广人大B

    /*
     * 小b推广佣金和服务费非配比例  管理员和供货商使用
     * shoRecomOne + shoRecomTwo +shoRecomThr +  shoRecomFor= 100
     */
    private Integer shoRecomOne; //平台
    private Integer shoRecomTwo; //供货商
    private Integer shoRecomThr;  //代理商
    private Integer shoRecomFor;  //推广人小b

    private String degree; //等级
    private Integer subShoNum;  //下级数量
    private String identityStrOne;
    private String identityStrTwo;

    public String getUsername() {
        return username;
    }

    public AdminUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public AdminUser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdminUser setName(String name) {
        this.name = name;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public AdminUser setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getMobi() {
        return mobi;
    }

    public AdminUser setMobi(String mobi) {
        this.mobi = mobi;
        return this;
    }

    public String getEnamil() {
        return enamil;
    }

    public AdminUser setEnamil(String enamil) {
        this.enamil = enamil;
        return this;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public AdminUser setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public long getLoginTime() {
        return loginTime;
    }

    public AdminUser setLoginTime(long loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AdminUser setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public AdminUser setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public AdminUser setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getArea() {
        return area;
    }

    public AdminUser setArea(String area) {
        this.area = area;
        return this;
    }

    public String getBigLogo() {
        return bigLogo;
    }

    public AdminUser setBigLogo(String bigLogo) {
        this.bigLogo = bigLogo;
        return this;
    }

    public String getMiddleLogo() {
        return middleLogo;
    }

    public AdminUser setMiddleLogo(String middleLogo) {
        this.middleLogo = middleLogo;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public AdminUser setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public AdminUser setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
        return this;
    }

    public String getIdentityCardOne() {
        return identityCardOne;
    }

    public AdminUser setIdentityCardOne(String identityCardOne) {
        this.identityCardOne = identityCardOne;
        return this;
    }

    public String getIdentityCardTwo() {
        return identityCardTwo;
    }

    public AdminUser setIdentityCardTwo(String identityCardTwo) {
        this.identityCardTwo = identityCardTwo;
        return this;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public AdminUser setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public AdminUser setIsPay(Integer isPay) {
        this.isPay = isPay;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AdminUser setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public AdminUser setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getAgentId() {
        return agentId;
    }

    public AdminUser setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }

    public Long getRecommendId() {
        return recommendId;
    }

    public AdminUser setRecommendId(Long recommendId) {
        this.recommendId = recommendId;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public AdminUser setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public AdminUser setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public AdminUser setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public String getUnionId() {
        return unionId;
    }

    public AdminUser setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public AdminUser setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public AdminUser setDistrictId(Long districtId) {
        this.districtId = districtId;
        return this;
    }

    public Long getCityId() {
        return cityId;
    }

    public AdminUser setCityId(Long cityId) {
        this.cityId = cityId;
        return this;
    }

    public Long getShopId() {
        return shopId;
    }

    public AdminUser setShopId(Long shopId) {
        this.shopId = shopId;
        return this;
    }

    public Integer getIsAllowM() {
        return isAllowM;
    }

    public AdminUser setIsAllowM(Integer isAllowM) {
        this.isAllowM = isAllowM;
        return this;
    }

    public Double getAgeServiceCharge() {
        return ageServiceCharge;
    }

    public AdminUser setAgeServiceCharge(Double ageServiceCharge) {
        this.ageServiceCharge = ageServiceCharge;
        return this;
    }

    public Double getAgeCashDeposit() {
        return ageCashDeposit;
    }

    public AdminUser setAgeCashDeposit(Double ageCashDeposit) {
        this.ageCashDeposit = ageCashDeposit;
        return this;
    }

    public Double getShoServiceCharge() {
        return shoServiceCharge;
    }

    public AdminUser setShoServiceCharge(Double shoServiceCharge) {
        this.shoServiceCharge = shoServiceCharge;
        return this;
    }

    public Double getShoCashDeposit() {
        return shoCashDeposit;
    }

    public AdminUser setShoCashDeposit(Double shoCashDeposit) {
        this.shoCashDeposit = shoCashDeposit;
        return this;
    }

    public Integer getMaximumRecommend() {
        return maximumRecommend;
    }

    public AdminUser setMaximumRecommend(Integer maximumRecommend) {
        this.maximumRecommend = maximumRecommend;
        return this;
    }

    public String getDueTime() {
        return dueTime;
    }

    public AdminUser setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }

    public Double getMinAgeServiceCharge() {
        return minAgeServiceCharge;
    }

    public AdminUser setMinAgeServiceCharge(Double minAgeServiceCharge) {
        this.minAgeServiceCharge = minAgeServiceCharge;
        return this;
    }

    public Double getMinShoServiceCharge() {
        return minShoServiceCharge;
    }

    public AdminUser setMinShoServiceCharge(Double minShoServiceCharge) {
        this.minShoServiceCharge = minShoServiceCharge;
        return this;
    }

    public Integer getAgeRecomOne() {
        return ageRecomOne;
    }

    public AdminUser setAgeRecomOne(Integer ageRecomOne) {
        this.ageRecomOne = ageRecomOne;
        return this;
    }

    public Integer getAgeRecomTwo() {
        return ageRecomTwo;
    }

    public AdminUser setAgeRecomTwo(Integer ageRecomTwo) {
        this.ageRecomTwo = ageRecomTwo;
        return this;
    }

    public Integer getAgeRecomThr() {
        return ageRecomThr;
    }

    public AdminUser setAgeRecomThr(Integer ageRecomThr) {
        this.ageRecomThr = ageRecomThr;
        return this;
    }

    public Integer getShoRecomOne() {
        return shoRecomOne;
    }

    public AdminUser setShoRecomOne(Integer shoRecomOne) {
        this.shoRecomOne = shoRecomOne;
        return this;
    }

    public Integer getShoRecomTwo() {
        return shoRecomTwo;
    }

    public AdminUser setShoRecomTwo(Integer shoRecomTwo) {
        this.shoRecomTwo = shoRecomTwo;
        return this;
    }

    public Integer getShoRecomThr() {
        return shoRecomThr;
    }

    public AdminUser setShoRecomThr(Integer shoRecomThr) {
        this.shoRecomThr = shoRecomThr;
        return this;
    }

    public Integer getShoRecomFor() {
        return shoRecomFor;
    }

    public AdminUser setShoRecomFor(Integer shoRecomFor) {
        this.shoRecomFor = shoRecomFor;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public AdminUser setDegree(String degree) {
        this.degree = degree;
        return this;
    }

    public Integer getSubShoNum() {
        return subShoNum;
    }

    public AdminUser setSubShoNum(Integer subShoNum) {
        this.subShoNum = subShoNum;
        return this;
    }

    public String getIdentityStrOne() {
        return identityStrOne;
    }

    public AdminUser setIdentityStrOne(String identityStrOne) {
        this.identityStrOne = identityStrOne;
        return this;
    }

    public String getIdentityStrTwo() {
        return identityStrTwo;
    }

    public AdminUser setIdentityStrTwo(String identityStrTwo) {
        this.identityStrTwo = identityStrTwo;
        return this;
    }

    public String getId() {
        return id;
    }

    public AdminUser setId(String id) {
        this.id = id;
        return this;
    }
}
