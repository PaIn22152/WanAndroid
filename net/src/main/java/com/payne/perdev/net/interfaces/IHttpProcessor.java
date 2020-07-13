package com.payne.perdev.net.interfaces;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net.interfaces
 * Date       2020/07/13 - 17:54
 * Author     Payne.
 * About      类描述：
 */
public interface IHttpProcessor {

    void get(String path, IHttpCallback callback);

    void post(String path, IHttpCallback callback);

}
