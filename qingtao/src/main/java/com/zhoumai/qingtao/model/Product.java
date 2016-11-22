package com.zhoumai.qingtao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ${张科} on 2016/4/5.
 * 产品
 */
public class Product implements Serializable {
    private Long id;

    private Long adminUserId;  //供货商id---需求改变，不用
    private Long shopId;       //店铺id      关联shopId;
    private Long shopUserId;   //店铺管理员id  匹配AdminUserId
    private Long agentId;      //经销商id---需求改变，不用
    private String name; //名字
    private BigDecimal price;  //现价
    private BigDecimal discountPrice;  //原价
    private BigDecimal marketPrice; //市场价
    private String image;   //主图
    private String detailImage;   //详情图
    private String sliderImages;   //轮播图
    private Integer status;  //状态   0：上架  1：下架
    private String startTime;
    private String endTime;
    private Long catId;            //分类id
    private String categoryName;   //分类名字
    private String fullCatidPath;
    private String weight;  //重量
    private String place;   //发货地
    private Long countryId;         //国家id
    private String countryName;     //国家名字
    private Long brandId;           //品牌id
    private String brandName;       //品牌名字
    private String factory;  //工厂
    private String spec;
    private Integer maxnum;   //最大购买量
    private Long stock;   //库存
    private Integer isNew;  //新品
    private Long salesVolume;    //销量
    private Long pageView;    //浏览量
    private Integer isRecommend;  //推荐
    private String desc;  //描述
    private Integer score;   //分数
    private BigDecimal commission;  //佣金
    private Integer isGlobal; //默认0,1：海淘；  海淘产品一个产品对应一个订单
    private Integer limitNum;// 限购数量
    private Integer recommend; //爆款推荐        默认0，1：爆款推荐
    private Integer specialSale; //今日特卖        默认0，1：今日特卖
    private Integer limitBuyFlag; //限时购标记   0：普通   1：限时购
    private Double discountRate; //优惠比例
    private String startDate; //限时购开始
    private String endDate; //限时购结束
    private String opeTime;   //活动操作时间

    private boolean isSelete;//是否被选择  我的收藏用
    private List<String> imageList;

    private int isCollect;


    private String abstractInfo;

    public int getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(int isCollect) {
        this.isCollect = isCollect;
    }

    public boolean isSelete() {
        return isSelete;
    }

    public void setSelete(boolean selete) {
        isSelete = selete;
    }

    public Long getAdminUserId() {
        return adminUserId;
    }

    public Product setAdminUserId(Long adminUserId) {
        this.adminUserId = adminUserId;
        return this;
    }

    public Long getShopId() {
        return shopId;
    }

    public Product setShopId(Long shopId) {
        this.shopId = shopId;
        return this;
    }

    public Long getShopUserId() {
        return shopUserId;
    }

    public Product setShopUserId(Long shopUserId) {
        this.shopUserId = shopUserId;
        return this;
    }

    public Long getAgentId() {
        return agentId;
    }

    public Product setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Product setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public Product setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public Product setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Product setImage(String image) {
        this.image = image;
        return this;
    }

    public String getDetailImage() {
        return detailImage;
    }

    public Product setDetailImage(String detailImage) {
        this.detailImage = detailImage;
        return this;
    }

    public String getSliderImages() {
        return sliderImages;
    }

    public Product setSliderImages(String sliderImages) {
        this.sliderImages = sliderImages;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Product setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public Product setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public Product setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public Long getCatId() {
        return catId;
    }

    public Product setCatId(Long catId) {
        this.catId = catId;
        return this;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Product setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public String getFullCatidPath() {
        return fullCatidPath;
    }

    public Product setFullCatidPath(String fullCatidPath) {
        this.fullCatidPath = fullCatidPath;
        return this;
    }

    public String getWeight() {
        return weight;
    }

    public Product setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Product setPlace(String place) {
        this.place = place;
        return this;
    }

    public Long getCountryId() {
        return countryId;
    }

    public Product setCountryId(Long countryId) {
        this.countryId = countryId;
        return this;
    }

    public String getCountryName() {
        return countryName;
    }

    public Product setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public Long getBrandId() {
        return brandId;
    }

    public Product setBrandId(Long brandId) {
        this.brandId = brandId;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public Product setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getFactory() {
        return factory;
    }

    public Product setFactory(String factory) {
        this.factory = factory;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public Product setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public Product setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
        return this;
    }

    public Long getStock() {
        return stock;
    }

    public Product setStock(Long stock) {
        this.stock = stock;
        return this;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public Product setIsNew(Integer isNew) {
        this.isNew = isNew;
        return this;
    }

    public Long getSalesVolume() {
        return salesVolume;
    }

    public Product setSalesVolume(Long salesVolume) {
        this.salesVolume = salesVolume;
        return this;
    }

    public Long getPageView() {
        return pageView;
    }

    public Product setPageView(Long pageView) {
        this.pageView = pageView;
        return this;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public Product setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Product setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public Product setScore(Integer score) {
        this.score = score;
        return this;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public Product setCommission(BigDecimal commission) {
        this.commission = commission;
        return this;
    }

    public Integer getIsGlobal() {
        return isGlobal;
    }

    public Product setIsGlobal(Integer isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public Product setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public Product setRecommend(Integer recommend) {
        this.recommend = recommend;
        return this;
    }

    public Integer getSpecialSale() {
        return specialSale;
    }

    public Product setSpecialSale(Integer specialSale) {
        this.specialSale = specialSale;
        return this;
    }

    public Integer getLimitBuyFlag() {
        return limitBuyFlag;
    }

    public Product setLimitBuyFlag(Integer limitBuyFlag) {
        this.limitBuyFlag = limitBuyFlag;
        return this;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public Product setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public Product setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public Product setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getOpeTime() {
        return opeTime;
    }

    public Product setOpeTime(String opeTime) {
        this.opeTime = opeTime;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }


    @Override
    public String toString() {
        return "Product{" +
               "id=" + id +
               ", adminUserId=" + adminUserId +
               ", shopId=" + shopId +
               ", shopUserId=" + shopUserId +
               ", agentId=" + agentId +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", discountPrice=" + discountPrice +
               ", marketPrice=" + marketPrice +
               ", image='" + image + '\'' +
               ", detailImage='" + detailImage + '\'' +
               ", sliderImages='" + sliderImages + '\'' +
               ", status=" + status +
               ", startTime='" + startTime + '\'' +
               ", endTime='" + endTime + '\'' +
               ", catId=" + catId +
               ", categoryName='" + categoryName + '\'' +
               ", fullCatidPath='" + fullCatidPath + '\'' +
               ", weight='" + weight + '\'' +
               ", place='" + place + '\'' +
               ", countryId=" + countryId +
               ", countryName='" + countryName + '\'' +
               ", brandId=" + brandId +
               ", brandName='" + brandName + '\'' +
               ", factory='" + factory + '\'' +
               ", spec='" + spec + '\'' +
               ", maxnum=" + maxnum +
               ", stock=" + stock +
               ", isNew=" + isNew +
               ", salesVolume=" + salesVolume +
               ", pageView=" + pageView +
               ", isRecommend=" + isRecommend +
               ", desc='" + desc + '\'' +
               ", score=" + score +
               ", commission=" + commission +
               ", isGlobal=" + isGlobal +
               ", limitNum=" + limitNum +
               ", recommend=" + recommend +
               ", specialSale=" + specialSale +
               ", limitBuyFlag=" + limitBuyFlag +
               ", discountRate=" + discountRate +
               ", startDate='" + startDate + '\'' +
               ", endDate='" + endDate + '\'' +
               ", opeTime='" + opeTime + '\'' +
               '}';
    }

    public String getAbstractInfo() {
        return abstractInfo;
    }

    public Product setAbstractInfo(String abstractInfo) {
        this.abstractInfo = abstractInfo;
        return this;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }
}
