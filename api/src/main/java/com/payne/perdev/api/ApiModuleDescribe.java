package com.payne.perdev.api;

import android.util.Log;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.api
 * Date       2020/07/13 - 18:32
 * Author     Payne.
 * About      类描述：
 * 接口封装模块，想做成类似Retrofit的框架，网络底层依赖net模块
 */
public class ApiModuleDescribe {
    public static void test() {
        AM_L.d("ApiModuleTest");

        String ss = new String("fff");
        StringBuilder sb = new StringBuilder();
        sb.append("dfasduuuee");
        sb.append(ss);
        sb.append(777);

        if (sb.toString().equals(ss)) {
            System.out.println("equals");
        } else {
            Log.d("dd", "gg");
        }

    }
}
