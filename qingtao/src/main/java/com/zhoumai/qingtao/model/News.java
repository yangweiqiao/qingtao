package com.zhoumai.qingtao.model;

/**
 * Created by Administrator on 2016/5/19.
 */

public class News {

    /**
     * id : 3
     * name : 网城卖奢侈品要求上传相关凭证 举证责任将从品牌转移到卖家
     * content : null
     * image : http://image.qingtaoapp.com/2016/5/9e682acc-4c53-482a-9a06-c3cc82910be8.png
     * url : http://admin.qingtaoapp.com/mobi/info/html?id=3
     * field1 : 0
     * field2 : 1970-01-01 08:00:00
     * source : null
     */

    private String id;
    private String name;
    private String content;
    private String image;
    private String url;
    private String field1;
    private String field2;
    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
