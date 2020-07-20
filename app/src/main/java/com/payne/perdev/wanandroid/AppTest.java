package com.payne.perdev.wanandroid;

import com.payne.perdev.api.ApiHelper;
import com.payne.perdev.api.ApiModuleDescribe;
import com.payne.perdev.api.Call;
import com.payne.perdev.api.Callback;
import com.payne.perdev.net.NetModuleDescribe;
import com.payne.perdev.net.interfaces.IHttpCallback;
import com.payne.perdev.net.okhttp.OkHttpProcessor;
import com.payne.perdev.wanandroid.api.WanApiService;
import com.payne.perdev.wanandroid.beans.WXArticleBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.wanandroid
 * Date       2020/07/13 - 18:52
 * Author     Payne.
 * About      类描述：
 */
public class AppTest {
    public static void test() {
        ApiModuleDescribe.test();

        NetModuleDescribe.test();
    }


    public static void apitest() {

        ApiHelper apiHelper = new ApiHelper.Builder()
                .baseUrl("https://wanandroid.com/")
                .build();
        WanApiService service = apiHelper.create(WanApiService.class);
        Call<List<WXArticleBean>> wxArticle = service.getWXArticle();
        wxArticle.enqueue(new Callback<List<WXArticleBean>>() {
            @Override
            public void onResponse(Call<List<WXArticleBean>> call) {

            }

            @Override
            public void onFailure(Call<List<WXArticleBean>> call, Throwable t) {

            }
        });

        LLL.d("apitest");

        /**
         * 获取公众号列表
         * https://wanandroid.com/wxarticle/chapters/json
         * 方法： GET
         */
        OkHttpProcessor processor = new OkHttpProcessor();
        processor.get("https://wanandroid.com/wxarticle/chapters/json", new IHttpCallback() {
            //        processor.get("https://cn.bing.com/HPImageArchive.aspx?format=js&idx=0&n=3", new IHttpCallback() {
            @Override
            public void onSuccess(String result) {
                LLL.d("apitest result=" + result);
            }

            @Override
            public void onFailure(String error, int code) {

            }
        });


        /**
         * https://www.wanandroid.com/user/register
         *
         * 方法：POST
         * 参数
         * 	username,password,repassword
         * */
        Map<String, String> map = new HashMap<>();
        map.put("username", "seryss");
        map.put("password", "000000");
        map.put("repassword", "000000");

        processor.post("https://www.wanandroid.com/user/register", map, new IHttpCallback() {
            //        processor.post("https://www.wanandroid.com/user/login", map, new IHttpCallback() {
//        processor.post("https://www.wanandroid.com/lg/uncollect_originId/2333/json", null, new IHttpCallback() {
            @Override
            public void onSuccess(String result) {
                LLL.d("onSuccess result=" + result);
            }

            @Override
            public void onFailure(String error, int code) {
                LLL.d("onFailure error=" + error);
            }
        });

    }
}
