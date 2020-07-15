package com.payne.perdev.source;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.source
 * Date       2020/07/14 - 09:36
 * Author     Payne.
 * About      类描述：
 */
public interface GitHubService {

    @GET("/users/{user}/repos")
    Call<UserBean> listRepos(@Path("user") String user);


    @POST("/users/{user}/repos")
    Call<UserBean> listRepos22(@Path("user") String user, @Field("sss") String sss);


}
