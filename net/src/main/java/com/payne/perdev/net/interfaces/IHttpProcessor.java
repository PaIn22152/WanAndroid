package com.payne.perdev.net.interfaces;

import java.util.Map;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net.interfaces
 * Date       2020/07/13 - 17:54
 * Author     Payne.
 * About      类描述：
 */
public interface IHttpProcessor {

    void get(String path, IHttpCallback callback);

    void post(String path, Map<String,String> params, IHttpCallback callback);

}
