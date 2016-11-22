package com.zhoumai.qingtao.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单行
 * @author fumf
 *
 */
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1739485296732504581L;
    private Long id;

	private Long orderId;  //订单id

    private Long cartItemId;  //cart_item_id
    private String itemNo;  //

    private Long productId;  //产品id
    private Long productDetailId;  //产品详情id(规格id)
    private String productSpec;  //产品规格详情


    private String productName;  //产品名字
    //@SerializedName(value = "productImg",alternate = "{image}")
    protected String productImg;  //产品图片

    private Integer num;   //数量
    private BigDecimal price;   //产品单价
    private BigDecimal totalFee;  //产品总价格
 
    private BigDecimal fee;    //实际支付的价格

    private Long couponId;   //优惠券id

    private Long couponFee;   //优惠费用

    private Long memberId;   //用户id

    private String elements;   //用户备注

    private Integer status;    //主订单状态

    private Integer commentStatus;    //评价状态

    private Long objId;

    private Long obj2Id;






    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(Long couponFee) {
        this.couponFee = couponFee;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
    }

    public Long getObj2Id() {
        return obj2Id;
    }

    public void setObj2Id(Long obj2Id) {
        this.obj2Id = obj2Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}