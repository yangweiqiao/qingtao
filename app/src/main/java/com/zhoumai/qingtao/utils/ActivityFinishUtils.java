package com.zhoumai.qingtao.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 退出app的方法
 */
public class ActivityFinishUtils {

    public static List<Activity> activities;


    public static void addActivity(Activity activity) {
        if (activities == null) {
            activities = new ArrayList<>();
        }
        activities.add(activity);
    }

    public static void finishAllActivity() {
        if (activities != null) {
            for (Activity activity : activities) {
                activity.finish();
            }

            activities = null;
        }
    }

}