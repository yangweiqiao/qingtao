package com.zhoumai.qingtao.model;

import java.io.Serializable;

/**
 * Created by ${张科} on 2016/4/8.
 */
public class RecieveAddress implements Serializable {

    private String id;
    private String memberId;//用户ID
    private String name; //名字
    private String mobile;//移动电话
    private String phone;   //固话
    private String identity;//身份证
    private String address;    //街道门牌号
    private String provinceId;   //省id
    private String cityId; //市id
    private String districtId;  //区id
    private String areaDetail;	 //省市区详细
    private int isDeleted;//是否删除了
    private String email;  // 邮政编码

    private Integer defaultAddr; //是否默认

    public Integer getDefaultAddr() {
        return defaultAddr;
    }

    public void setDefaultAddr(Integer defaultAddr) {
        this.defaultAddr = defaultAddr;
    }


    public String getMemberId() {
        return memberId;
    }

    public RecieveAddress setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getName() {
        return name;
    }

    public RecieveAddress setName(String name) {
        this.name = name;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public RecieveAddress setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public RecieveAddress setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public RecieveAddress setIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public RecieveAddress setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public RecieveAddress setProvinceId(String provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getCityId() {
        return cityId;
    }

    public RecieveAddress setCityId(String cityId) {
        this.cityId = cityId;
        return this;
    }

    public String getDistrictId() {
        return districtId;
    }

    public RecieveAddress setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }

    public String getAreaDetail() {
        return areaDetail;
    }

    public RecieveAddress setAreaDetail(String areaDetail) {
        this.areaDetail = areaDetail;
        return this;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public RecieveAddress setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RecieveAddress setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getId() {
        return id;
    }

    public RecieveAddress setId(String id) {
        this.id = id;
        return this;
    }


    @Override
    public String toString() {
        return "RecieveAddress{" +
               "id='" + id + '\'' +
               ", memberId='" + memberId + '\'' +
               ", name='" + name + '\'' +
               ", mobile='" + mobile + '\'' +
               ", phone='" + phone + '\'' +
               ", identity='" + identity + '\'' +
               ", address='" + address + '\'' +
               ", provinceId='" + provinceId + '\'' +
               ", cityId='" + cityId + '\'' +
               ", districtId='" + districtId + '\'' +
               ", areaDetail='" + areaDetail + '\'' +
               ", isDeleted=" + isDeleted +
               ", email='" + email + '\'' +
               ", defaultAddr=" + defaultAddr +
               '}';
    }
}
