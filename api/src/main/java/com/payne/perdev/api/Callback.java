package com.payne.perdev.api;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.api
 * Date       2020/07/20 - 15:46
 * Author     Payne.
 * About      类描述：
 */
public interface Callback<T> {

    void onResponse(Call<T> call);


    void onFailure(Call<T> call, Throwable t);
}
