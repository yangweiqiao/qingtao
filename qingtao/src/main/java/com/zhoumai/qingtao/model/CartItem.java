package com.zhoumai.qingtao.model;

/**
 * Created by ${张科} on 2016/4/11.
 */
public class CartItem {

    private Long id;  //购物车id
    private Long cartId;  //购物车id
    private Long memberId;         //用户id
    private Long productId;        //产品id
    private Long productDetailId;  //产品详情id(规格id)
    private int num;           //数量
    private double price;      //价格
    private double fee;        //总价
    private String elements;       //规格详细信息总和
    private String guigeIds;       //规格总和
    private Long objId;     //0：普通产品，1：全球购产品，每个产品单独生成一个订单
    private Long shopId;   //这里对应商户管理员的id
    private String shopName;   //商户名字
    private String productSpec;//规格字段
    private String productName;
    private String image;
    private Long stock;
    private Integer limitNum;

    private boolean isSelect;


    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCartId() {
        return cartId;
    }

    public CartItem setCartId(Long cartId) {
        this.cartId = cartId;
        return this;
    }

    public Long getMemberId() {
        return memberId;
    }

    public CartItem setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public CartItem setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Long getProductDetailId() {
        return productDetailId;
    }

    public CartItem setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
        return this;
    }

    public int getNum() {
        return num;
    }

    public CartItem setNum(int num) {
        this.num = num;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public CartItem setPrice(double price) {
        this.price = price;
        return this;
    }

    public double getFee() {
        return fee;
    }

    public CartItem setFee(double fee) {
        this.fee = fee;
        return this;
    }

    public String getElements() {
        return elements;
    }

    public CartItem setElements(String elements) {
        this.elements = elements;
        return this;
    }

    public String getGuigeIds() {
        return guigeIds;
    }

    public CartItem setGuigeIds(String guigeIds) {
        this.guigeIds = guigeIds;
        return this;
    }

    public Long getObjId() {
        return objId;
    }

    public CartItem setObjId(Long objId) {
        this.objId = objId;
        return this;
    }

    public Long getShopId() {
        return shopId;
    }

    public CartItem setShopId(Long shopId) {
        this.shopId = shopId;
        return this;
    }

    public String getShopName() {
        return shopName;
    }

    public CartItem setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public CartItem setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public String getImage() {
        return image;
    }

    public CartItem setImage(String image) {
        this.image = image;
        return this;
    }

    public Long getStock() {
        return stock;
    }

    public CartItem setStock(Long stock) {
        this.stock = stock;
        return this;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public CartItem setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public CartItem setIsSelect(boolean isSelect) {
        this.isSelect = isSelect;
        return this;
    }
}
