package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by yangw on 2016/11/26.
 */

public class Admin implements Serializable {

    /**
     * ok : true
     * code : 0
     * message : success
     * result : {"ct":1479864862161,"ut":1479870859237,"id":29859,"cr":0,"ur":0,"roleIds":null,"postId":0,"orgId":0,"username":"13810916949","createTime":null,"updateTime":null,"password":"","sign":null,"name":null,"twoCode":null,"nickName":null,"userIdOR":null,"mobi":"13810916949","enamil":null,"loginIp":null,"loginTime":0,"status":null,"sex":null,"birthday":null,"area":null,"bigLogo":null,"middleLogo":null,"logo":null,"identityCard":null,"identityCardOne":null,"identityCardTwo":null,"isDeleted":0,"isPay":null,"type":100,"supplierId":null,"agentId":null,"recommendId":null,"fullPath":"/29859/","level":1,"parentId":null,"openId":null,"unionId":null,"provinceId":null,"districtId":null,"cityId":null,"shopId":null,"expressFee":null,"isAllowM":null,"ageServiceCharge":null,"ageServiceCharge2":null,"ageService2Charge":null,"ageService2Charge2":null,"ageService3Charge":null,"ageService3Charge2":null,"ageCashDeposit":null,"shoServiceCharge":null,"shoServiceCharge2":null,"shoCashDeposit":null,"maximumRecommend":null,"dueTime":null,"minAgeServiceCharge":null,"minShoServiceCharge":null,"ageRecomOne":null,"ageRecomTwo":null,"ageRecomThr":null,"shoRecomOne":null,"shoRecomTwo":null,"shoRecomThr":null,"shoRecomFor":null,"degree":1,"subShoNum":0,"identityStrOne":null,"identityStrTwo":null}
     */

    private boolean ok;
    private int code;
    private String message;
    /**
     * ct : 1479864862161
     * ut : 1479870859237
     * id : 29859
     * cr : 0
     * ur : 0
     * roleIds : null
     * postId : 0
     * orgId : 0
     * username : 13810916949
     * createTime : null
     * updateTime : null
     * password :
     * sign : null
     * name : null
     * twoCode : null
     * nickName : null
     * userIdOR : null
     * mobi : 13810916949
     * enamil : null
     * loginIp : null
     * loginTime : 0
     * status : null
     * sex : null
     * birthday : null
     * area : null
     * bigLogo : null
     * middleLogo : null
     * logo : null
     * identityCard : null
     * identityCardOne : null
     * identityCardTwo : null
     * isDeleted : 0
     * isPay : null
     * type : 100
     * supplierId : null
     * agentId : null
     * recommendId : null
     * fullPath : /29859/
     * level : 1
     * parentId : null
     * openId : null
     * unionId : null
     * provinceId : null
     * districtId : null
     * cityId : null
     * shopId : null
     * expressFee : null
     * isAllowM : null
     * ageServiceCharge : null
     * ageServiceCharge2 : null
     * ageService2Charge : null
     * ageService2Charge2 : null
     * ageService3Charge : null
     * ageService3Charge2 : null
     * ageCashDeposit : null
     * shoServiceCharge : null
     * shoServiceCharge2 : null
     * shoCashDeposit : null
     * maximumRecommend : null
     * dueTime : null
     * minAgeServiceCharge : null
     * minShoServiceCharge : null
     * ageRecomOne : null
     * ageRecomTwo : null
     * ageRecomThr : null
     * shoRecomOne : null
     * shoRecomTwo : null
     * shoRecomThr : null
     * shoRecomFor : null
     * degree : 1
     * subShoNum : 0
     * identityStrOne : null
     * identityStrTwo : null
     */

    private AdminBean result;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AdminBean getResult() {
        return result;
    }

    public void setResult(AdminBean result) {
        this.result = result;
    }

    public static class AdminBean {
        private long ct;
        private long ut;
        private int id;
        private int cr;
        private int ur;
        private Object roleIds;
        private int postId;
        private int orgId;
        private String username;
        private Object createTime;
        private Object updateTime;
        private String password;
        private Object sign;
        private Object name;
        private Object twoCode;
        private Object nickName;
        private Object userIdOR;
        private String mobi;
        private Object enamil;
        private Object loginIp;
        private int loginTime;
        private Object status;
        private Object sex;
        private Object birthday;
        private Object area;
        private Object bigLogo;
        private Object middleLogo;
        private Object logo;
        private Object identityCard;
        private Object identityCardOne;
        private Object identityCardTwo;
        private int isDeleted;
        private Object isPay;
        private int type;
        private Object supplierId;
        private Object agentId;
        private Object recommendId;
        private String fullPath;
        private int level;
        private Object parentId;
        private Object openId;
        private Object unionId;
        private Object provinceId;
        private Object districtId;
        private Object cityId;
        private Object shopId;
        private Object expressFee;
        private Object isAllowM;
        private Object ageServiceCharge;
        private Object ageServiceCharge2;
        private Object ageService2Charge;
        private Object ageService2Charge2;
        private Object ageService3Charge;
        private Object ageService3Charge2;
        private Object ageCashDeposit;
        private Object shoServiceCharge;
        private Object shoServiceCharge2;
        private Object shoCashDeposit;
        private Object maximumRecommend;
        private Object dueTime;
        private Object minAgeServiceCharge;
        private Object minShoServiceCharge;
        private Object ageRecomOne;
        private Object ageRecomTwo;
        private Object ageRecomThr;
        private Object shoRecomOne;
        private Object shoRecomTwo;
        private Object shoRecomThr;
        private Object shoRecomFor;
        private int degree;
        private int subShoNum;
        private Object identityStrOne;
        private Object identityStrTwo;

        public long getCt() {
            return ct;
        }

        public void setCt(long ct) {
            this.ct = ct;
        }

        public long getUt() {
            return ut;
        }

        public void setUt(long ut) {
            this.ut = ut;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCr() {
            return cr;
        }

        public void setCr(int cr) {
            this.cr = cr;
        }

        public int getUr() {
            return ur;
        }

        public void setUr(int ur) {
            this.ur = ur;
        }

        public Object getRoleIds() {
            return roleIds;
        }

        public void setRoleIds(Object roleIds) {
            this.roleIds = roleIds;
        }

        public int getPostId() {
            return postId;
        }

        public void setPostId(int postId) {
            this.postId = postId;
        }

        public int getOrgId() {
            return orgId;
        }

        public void setOrgId(int orgId) {
            this.orgId = orgId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }

        public Object getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Object updateTime) {
            this.updateTime = updateTime;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Object getSign() {
            return sign;
        }

        public void setSign(Object sign) {
            this.sign = sign;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public Object getTwoCode() {
            return twoCode;
        }

        public void setTwoCode(Object twoCode) {
            this.twoCode = twoCode;
        }

        public Object getNickName() {
            return nickName;
        }

        public void setNickName(Object nickName) {
            this.nickName = nickName;
        }

        public Object getUserIdOR() {
            return userIdOR;
        }

        public void setUserIdOR(Object userIdOR) {
            this.userIdOR = userIdOR;
        }

        public String getMobi() {
            return mobi;
        }

        public void setMobi(String mobi) {
            this.mobi = mobi;
        }

        public Object getEnamil() {
            return enamil;
        }

        public void setEnamil(Object enamil) {
            this.enamil = enamil;
        }

        public Object getLoginIp() {
            return loginIp;
        }

        public void setLoginIp(Object loginIp) {
            this.loginIp = loginIp;
        }

        public int getLoginTime() {
            return loginTime;
        }

        public void setLoginTime(int loginTime) {
            this.loginTime = loginTime;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public Object getSex() {
            return sex;
        }

        public void setSex(Object sex) {
            this.sex = sex;
        }

        public Object getBirthday() {
            return birthday;
        }

        public void setBirthday(Object birthday) {
            this.birthday = birthday;
        }

        public Object getArea() {
            return area;
        }

        public void setArea(Object area) {
            this.area = area;
        }

        public Object getBigLogo() {
            return bigLogo;
        }

        public void setBigLogo(Object bigLogo) {
            this.bigLogo = bigLogo;
        }

        public Object getMiddleLogo() {
            return middleLogo;
        }

        public void setMiddleLogo(Object middleLogo) {
            this.middleLogo = middleLogo;
        }

        public Object getLogo() {
            return logo;
        }

        public void setLogo(Object logo) {
            this.logo = logo;
        }

        public Object getIdentityCard() {
            return identityCard;
        }

        public void setIdentityCard(Object identityCard) {
            this.identityCard = identityCard;
        }

        public Object getIdentityCardOne() {
            return identityCardOne;
        }

        public void setIdentityCardOne(Object identityCardOne) {
            this.identityCardOne = identityCardOne;
        }

        public Object getIdentityCardTwo() {
            return identityCardTwo;
        }

        public void setIdentityCardTwo(Object identityCardTwo) {
            this.identityCardTwo = identityCardTwo;
        }

        public int getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(int isDeleted) {
            this.isDeleted = isDeleted;
        }

        public Object getIsPay() {
            return isPay;
        }

        public void setIsPay(Object isPay) {
            this.isPay = isPay;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(Object supplierId) {
            this.supplierId = supplierId;
        }

        public Object getAgentId() {
            return agentId;
        }

        public void setAgentId(Object agentId) {
            this.agentId = agentId;
        }

        public Object getRecommendId() {
            return recommendId;
        }

        public void setRecommendId(Object recommendId) {
            this.recommendId = recommendId;
        }

        public String getFullPath() {
            return fullPath;
        }

        public void setFullPath(String fullPath) {
            this.fullPath = fullPath;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public Object getParentId() {
            return parentId;
        }

        public void setParentId(Object parentId) {
            this.parentId = parentId;
        }

        public Object getOpenId() {
            return openId;
        }

        public void setOpenId(Object openId) {
            this.openId = openId;
        }

        public Object getUnionId() {
            return unionId;
        }

        public void setUnionId(Object unionId) {
            this.unionId = unionId;
        }

        public Object getProvinceId() {
            return provinceId;
        }

        public void setProvinceId(Object provinceId) {
            this.provinceId = provinceId;
        }

        public Object getDistrictId() {
            return districtId;
        }

        public void setDistrictId(Object districtId) {
            this.districtId = districtId;
        }

        public Object getCityId() {
            return cityId;
        }

        public void setCityId(Object cityId) {
            this.cityId = cityId;
        }

        public Object getShopId() {
            return shopId;
        }

        public void setShopId(Object shopId) {
            this.shopId = shopId;
        }

        public Object getExpressFee() {
            return expressFee;
        }

        public void setExpressFee(Object expressFee) {
            this.expressFee = expressFee;
        }

        public Object getIsAllowM() {
            return isAllowM;
        }

        public void setIsAllowM(Object isAllowM) {
            this.isAllowM = isAllowM;
        }

        public Object getAgeServiceCharge() {
            return ageServiceCharge;
        }

        public void setAgeServiceCharge(Object ageServiceCharge) {
            this.ageServiceCharge = ageServiceCharge;
        }

        public Object getAgeServiceCharge2() {
            return ageServiceCharge2;
        }

        public void setAgeServiceCharge2(Object ageServiceCharge2) {
            this.ageServiceCharge2 = ageServiceCharge2;
        }

        public Object getAgeService2Charge() {
            return ageService2Charge;
        }

        public void setAgeService2Charge(Object ageService2Charge) {
            this.ageService2Charge = ageService2Charge;
        }

        public Object getAgeService2Charge2() {
            return ageService2Charge2;
        }

        public void setAgeService2Charge2(Object ageService2Charge2) {
            this.ageService2Charge2 = ageService2Charge2;
        }

        public Object getAgeService3Charge() {
            return ageService3Charge;
        }

        public void setAgeService3Charge(Object ageService3Charge) {
            this.ageService3Charge = ageService3Charge;
        }

        public Object getAgeService3Charge2() {
            return ageService3Charge2;
        }

        public void setAgeService3Charge2(Object ageService3Charge2) {
            this.ageService3Charge2 = ageService3Charge2;
        }

        public Object getAgeCashDeposit() {
            return ageCashDeposit;
        }

        public void setAgeCashDeposit(Object ageCashDeposit) {
            this.ageCashDeposit = ageCashDeposit;
        }

        public Object getShoServiceCharge() {
            return shoServiceCharge;
        }

        public void setShoServiceCharge(Object shoServiceCharge) {
            this.shoServiceCharge = shoServiceCharge;
        }

        public Object getShoServiceCharge2() {
            return shoServiceCharge2;
        }

        public void setShoServiceCharge2(Object shoServiceCharge2) {
            this.shoServiceCharge2 = shoServiceCharge2;
        }

        public Object getShoCashDeposit() {
            return shoCashDeposit;
        }

        public void setShoCashDeposit(Object shoCashDeposit) {
            this.shoCashDeposit = shoCashDeposit;
        }

        public Object getMaximumRecommend() {
            return maximumRecommend;
        }

        public void setMaximumRecommend(Object maximumRecommend) {
            this.maximumRecommend = maximumRecommend;
        }

        public Object getDueTime() {
            return dueTime;
        }

        public void setDueTime(Object dueTime) {
            this.dueTime = dueTime;
        }

        public Object getMinAgeServiceCharge() {
            return minAgeServiceCharge;
        }

        public void setMinAgeServiceCharge(Object minAgeServiceCharge) {
            this.minAgeServiceCharge = minAgeServiceCharge;
        }

        public Object getMinShoServiceCharge() {
            return minShoServiceCharge;
        }

        public void setMinShoServiceCharge(Object minShoServiceCharge) {
            this.minShoServiceCharge = minShoServiceCharge;
        }

        public Object getAgeRecomOne() {
            return ageRecomOne;
        }

        public void setAgeRecomOne(Object ageRecomOne) {
            this.ageRecomOne = ageRecomOne;
        }

        public Object getAgeRecomTwo() {
            return ageRecomTwo;
        }

        public void setAgeRecomTwo(Object ageRecomTwo) {
            this.ageRecomTwo = ageRecomTwo;
        }

        public Object getAgeRecomThr() {
            return ageRecomThr;
        }

        public void setAgeRecomThr(Object ageRecomThr) {
            this.ageRecomThr = ageRecomThr;
        }

        public Object getShoRecomOne() {
            return shoRecomOne;
        }

        public void setShoRecomOne(Object shoRecomOne) {
            this.shoRecomOne = shoRecomOne;
        }

        public Object getShoRecomTwo() {
            return shoRecomTwo;
        }

        public void setShoRecomTwo(Object shoRecomTwo) {
            this.shoRecomTwo = shoRecomTwo;
        }

        public Object getShoRecomThr() {
            return shoRecomThr;
        }

        public void setShoRecomThr(Object shoRecomThr) {
            this.shoRecomThr = shoRecomThr;
        }

        public Object getShoRecomFor() {
            return shoRecomFor;
        }

        public void setShoRecomFor(Object shoRecomFor) {
            this.shoRecomFor = shoRecomFor;
        }

        public int getDegree() {
            return degree;
        }

        public void setDegree(int degree) {
            this.degree = degree;
        }

        public int getSubShoNum() {
            return subShoNum;
        }

        public void setSubShoNum(int subShoNum) {
            this.subShoNum = subShoNum;
        }

        public Object getIdentityStrOne() {
            return identityStrOne;
        }

        public void setIdentityStrOne(Object identityStrOne) {
            this.identityStrOne = identityStrOne;
        }

        public Object getIdentityStrTwo() {
            return identityStrTwo;
        }

        public void setIdentityStrTwo(Object identityStrTwo) {
            this.identityStrTwo = identityStrTwo;
        }
    }
}
