package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by 刘涛 on 2016/8/26.
 */
public class Spec {


    /**
     * typeName : 默认规格
     * details : [{"ct":1472090058136,"ut":1472090058136,"id":3671,"catId":96,"typeId":268,"name":"默认规格","isDeleted":0}]
     */

    private String typeName;
    /**
     * ct : 1472090058136
     * ut : 1472090058136
     * id : 3671
     * catId : 96
     * typeId : 268
     * name : 默认规格
     * isDeleted : 0
     */

    private List<DetailsBean> details;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<DetailsBean> getDetails() {
        return details;
    }

    public void setDetails(List<DetailsBean> details) {
        this.details = details;
    }

    public static class DetailsBean {
        private long ct;
        private long ut;
        private String id;
        private String catId;
        private int typeId;
        private String name;
        private int isDeleted;

        private boolean isSelect;//是否被选中

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



        public int getTypeId() {
            return typeId;
        }

        public void setTypeId(int typeId) {
            this.typeId = typeId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getIsDeleted() {
            return isDeleted;
        }

        public void setIsDeleted(int isDeleted) {
            this.isDeleted = isDeleted;
        }

        public boolean isSelect() {
            return isSelect;
        }

        public void setSelect(boolean select) {
            isSelect = select;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCatId() {
            return catId;
        }

        public void setCatId(String catId) {
            this.catId = catId;
        }
    }
}
