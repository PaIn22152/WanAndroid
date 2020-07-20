package com.payne.perdev.api;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.api
 * Date       2020/07/20 - 15:18
 * Author     Payne.
 * About      类描述：
 */
public interface Call<T> {
    void enqueue(Callback<T> callback);
}
