package com.payne.perdev.source;

import retrofit2.Retrofit;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.source
 * Date       2020/07/13 - 18:47
 * Author     Payne.
 * About      类描述：
 * 查看第三方框架源码的模块，没有实际用途
 */
public class SourceModuleDescribe {

    public static void test(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/") // 设置网络请求的Url地址
//                .addConverterFactory(GsonConverterFactory.create()) // 设置数据解析器
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) // 支持RxJava平台
                .build();


//        // 步骤5:创建 网络请求接口 的实例
//        GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);
//
//        //对 发送请求 进行封装
//        Call<Translation> call = request.getCall();
//
//        //步骤6:发送网络请求(异步)
//        call.enqueue(new Callback<Translation>() {
//            //请求成功时回调
//            @Override
//            public void onResponse(Call<Translation> call, Response<Translation> response) {
//                // 步骤7：处理返回的数据结果
//                response.body().show();
//            }
//
//            //请求失败时回调
//            @Override
//            public void onFailure(Call<Translation> call, Throwable throwable) {
//                System.out.println("连接失败");
//            }
//        });

    }
}
