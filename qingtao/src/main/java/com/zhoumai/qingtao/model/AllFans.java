package com.zhoumai.qingtao.model;

import java.util.List;

/**
 * Created by Administrator on 2016/11/18.
 */

public class AllFans {

    /**
     * ok : true
     * code : 0
     * message : success
     * result : {"list1":[{"name":"admin","logo":"/2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png","mobi":"未填写电话","id":1,"createTime":"2016-04-18 15:58:27","sex":"男"}],"levelOne":-1,"list3":[{"name":"admin","logo":"/2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png","mobi":"未填写电话","id":1,"createTime":"2016-04-18 15:58:27","sex":"男"}],"list2":[{"name":"admin","logo":"/2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png","mobi":"未填写电话","id":1,"createTime":"2016-04-18 15:58:27","sex":"男"}],"levelTwo":-1,"levelThree":-1}
     */

    private boolean ok;
    private int code;
    private String message;
    private ResultBean result;

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

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * list1 : [{"name":"admin","logo":"/2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png","mobi":"未填写电话","id":1,"createTime":"2016-04-18 15:58:27","sex":"男"}]
         * levelOne : -1
         * list3 : [{"name":"admin","logo":"/2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png","mobi":"未填写电话","id":1,"createTime":"2016-04-18 15:58:27","sex":"男"}]
         * list2 : [{"name":"admin","logo":"/2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png","mobi":"未填写电话","id":1,"createTime":"2016-04-18 15:58:27","sex":"男"}]
         * levelTwo : -1
         * levelThree : -1
         */

        private int levelOne;
        private int levelTwo;
        private int levelThree;
        private List<List1Bean> list1;
        private List<List3Bean> list3;
        private List<List2Bean> list2;

        public int getLevelOne() {
            return levelOne;
        }

        public void setLevelOne(int levelOne) {
            this.levelOne = levelOne;
        }

        public int getLevelTwo() {
            return levelTwo;
        }

        public void setLevelTwo(int levelTwo) {
            this.levelTwo = levelTwo;
        }

        public int getLevelThree() {
            return levelThree;
        }

        public void setLevelThree(int levelThree) {
            this.levelThree = levelThree;
        }

        public List<List1Bean> getList1() {
            return list1;
        }

        public void setList1(List<List1Bean> list1) {
            this.list1 = list1;
        }

        public List<List3Bean> getList3() {
            return list3;
        }

        public void setList3(List<List3Bean> list3) {
            this.list3 = list3;
        }

        public List<List2Bean> getList2() {
            return list2;
        }

        public void setList2(List<List2Bean> list2) {
            this.list2 = list2;
        }

        public static class List1Bean {
            /**
             * name : admin
             * logo : /2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png
             * mobi : 未填写电话
             * id : 1
             * createTime : 2016-04-18 15:58:27
             * sex : 男
             */

            private String name;
            private String logo;
            private String mobi;
            private int id;
            private String createTime;
            private String sex;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getMobi() {
                return mobi;
            }

            public void setMobi(String mobi) {
                this.mobi = mobi;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }
        }

        public static class List3Bean {
            /**
             * name : admin
             * logo : /2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png
             * mobi : 未填写电话
             * id : 1
             * createTime : 2016-04-18 15:58:27
             * sex : 男
             */

            private String name;
            private String logo;
            private String mobi;
            private int id;
            private String createTime;
            private String sex;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getMobi() {
                return mobi;
            }

            public void setMobi(String mobi) {
                this.mobi = mobi;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }
        }

        public static class List2Bean {
            /**
             * name : admin
             * logo : /2016/3/2964b244-2c31-41c9-8c75-1d9f7c89b2c0.png
             * mobi : 未填写电话
             * id : 1
             * createTime : 2016-04-18 15:58:27
             * sex : 男
             */

            private String name;
            private String logo;
            private String mobi;
            private int id;
            private String createTime;
            private String sex;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getMobi() {
                return mobi;
            }

            public void setMobi(String mobi) {
                this.mobi = mobi;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }
        }
    }
}
