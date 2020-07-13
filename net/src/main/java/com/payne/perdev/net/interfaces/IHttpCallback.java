package com.payne.perdev.net.interfaces;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net.interfaces
 * Date       2020/07/13 - 17:55
 * Author     Payne.
 * About      类描述：
 */
public interface IHttpCallback {
    /**
     * 请求成功，返回数据
     */
    void onSuccess(String result);

    /**
     * 请求失败，返回失败信息
     */
    void onFailure(String error, int code);
}
