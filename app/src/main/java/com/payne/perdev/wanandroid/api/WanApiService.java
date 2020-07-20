package com.payne.perdev.wanandroid.api;

import com.payne.perdev.api.Call;
import com.payne.perdev.api.i.GET;
import com.payne.perdev.wanandroid.beans.WXArticleBean;

import java.util.List;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.wanandroid.api
 * Date       2020/07/14 - 09:47
 * Author     Payne.
 * About      类描述：
 */
public interface WanApiService {


    /**
     * 获取公众号列表
     * https://wanandroid.com/wxarticle/chapters/json
     * 方法： GET
     */
    @GET("/wxarticle/chapters/json")
    Call<List<WXArticleBean>> getWXArticle();
}
