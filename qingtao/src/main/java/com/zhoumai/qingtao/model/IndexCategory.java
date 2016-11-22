package com.zhoumai.qingtao.model;

/**
 * Created by 刘涛 on 2016/9/22.
 *
 * 首页资讯分类
 */

public class IndexCategory {


    /**
     * ct : 0
     * ut : 1474362013934
     * id : 26
     * createTime : null
     * updateTime : 2016-09-20 17:00:13
     * creator : null
     * updater : 2
     * isDeleted : 0
     * parentId : 25
     * name : 授权官方
     * code : official
     * type : 1
     * image : http://qingtao-img.oss-cn-hangzhou.aliyuncs.com/qingtao/2016/9/8f1ba73d4f66be24bc3666699ea652782c67ec01.jpg
     * desc :
     * sort : null
     * isLeaf : 1
     * url :
     * infos : null
     * _parentId : 25
     */


    private int id;
    private int parentId;
    private String name;
    private String code;
    private int type;
    private String image;
    private String desc;
    private String url;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
