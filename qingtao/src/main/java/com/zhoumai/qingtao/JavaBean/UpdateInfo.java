package com.zhoumai.qingtao.JavaBean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ${杨伟乔} on 2016/12/4.
 * 邮箱: yangweiqiao@126.com
 * QQ: 463217558
 * 别人光鲜的背后或者有着太多不为人知的痛苦
 * 学习可以改变一切、 行动可以解决一切问题、
 */

public class UpdateInfo {
    /**
     * ok : true
     * code : 0
     * message : success
     * result : {"ct":1479891911851,"ut":1479891911851,"id":41,"versionCode":40,"versionName":"1.8.2","apkPackage":"com.sunday.qingtao","minSdkVersion":"16","apkName":"@7F07005C","fileMd5":"b7c8129bb6ae176749d25bcad7f2beb9","fizeSize":"42526786","fileLogs":"修复\"创业空间\"的点击闪退问题","downLoadUrl":"http://image.qingtaoapp.com/apk/android/app_1_40_1.8.2.apk","type":1}
     */

    private boolean ok;
    private int code;
    private String message;

    @Override
    public String toString() {
        return "UpdateInfo{" +
                "ok=" + ok +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", NewAppInfo=" + NewAppInfo +
                '}';
    }

    /**
     * ct : 1479891911851
     * ut : 1479891911851
     * id : 41
     * versionCode : 40
     * versionName : 1.8.2
     * apkPackage : com.sunday.qingtao
     * minSdkVersion : 16
     * apkName : @7F07005C
     * fileMd5 : b7c8129bb6ae176749d25bcad7f2beb9
     * fizeSize : 42526786
     * fileLogs : 修复"创业空间"的点击闪退问题
     * downLoadUrl : http://image.qingtaoapp.com/apk/android/app_1_40_1.8.2.apk
     * type : 1
     */

    @SerializedName("result")
    private NewAppInfo NewAppInfo;

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

    public NewAppInfo getNewAppInfo() {
        return NewAppInfo;
    }

    public void setNewAppInfo(NewAppInfo NewAppInfo) {
        this.NewAppInfo = NewAppInfo;
    }

    public static class NewAppInfo {
        private long ct;
        private long ut;
        private int id;
        private int versionCode;
        private String versionName;
        private String apkPackage;
        private String minSdkVersion;
        private String apkName;
        private String fileMd5;
        private String fizeSize;
        private String fileLogs;
        private String downLoadUrl;
        private int type;

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

        public int getVersionCode() {
            return versionCode;
        }

        public void setVersionCode(int versionCode) {
            this.versionCode = versionCode;
        }

        public String getVersionName() {
            return versionName;
        }

        public void setVersionName(String versionName) {
            this.versionName = versionName;
        }

        public String getApkPackage() {
            return apkPackage;
        }

        public void setApkPackage(String apkPackage) {
            this.apkPackage = apkPackage;
        }

        public String getMinSdkVersion() {
            return minSdkVersion;
        }

        public void setMinSdkVersion(String minSdkVersion) {
            this.minSdkVersion = minSdkVersion;
        }

        public String getApkName() {
            return apkName;
        }

        public void setApkName(String apkName) {
            this.apkName = apkName;
        }

        public String getFileMd5() {
            return fileMd5;
        }

        public void setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
        }

        public String getFizeSize() {
            return fizeSize;
        }

        public void setFizeSize(String fizeSize) {
            this.fizeSize = fizeSize;
        }

        public String getFileLogs() {
            return fileLogs;
        }

        public void setFileLogs(String fileLogs) {
            this.fileLogs = fileLogs;
        }

        public String getDownLoadUrl() {
            return downLoadUrl;
        }

        public void setDownLoadUrl(String downLoadUrl) {
            this.downLoadUrl = downLoadUrl;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
