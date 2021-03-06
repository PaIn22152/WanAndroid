package com.payne.perdev.api;

import android.util.Log;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.api
 * Date       2020/07/13 - 18:32
 * Author     Payne.
 * About      类描述：
 */
public class AM_L {


    public static final boolean LOG_SHOW = true;
    public static final String TAG = "apimoduletag";

    public static void d(String tag, String s) {
        if (LOG_SHOW) {
            Log.d(tag, s);
        }
    }

    public static void d(String s) {
        d(TAG, s);
    }


    public static void e(String tag, String s) {
        if (LOG_SHOW) {
            Log.e(tag, s);
        }
    }

    public static void e(String s) {
        e(TAG, s);
    }

}
