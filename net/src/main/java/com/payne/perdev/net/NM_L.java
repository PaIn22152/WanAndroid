package com.payne.perdev.net;

import android.util.Log;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net
 * Date       2020/07/13 - 18:11
 * Author     Payne.
 * About      类描述：
 * todo 想控制这个类只能在NetModule内部使用，未找到解决方案
 */

public class NM_L {


    public static final boolean LOG_SHOW = true;
    public static final String TAG = "netmoduletag";

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
