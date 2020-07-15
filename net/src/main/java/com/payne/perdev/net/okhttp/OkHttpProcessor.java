package com.payne.perdev.net.okhttp;

import com.payne.perdev.net.NM_L;
import com.payne.perdev.net.ThreadPool;
import com.payne.perdev.net.interfaces.IHttpCallback;
import com.payne.perdev.net.interfaces.IHttpProcessor;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net.okhttp
 * Date       2020/07/13 - 18:10
 * Author     Payne.
 * About      类描述：
 */
public class OkHttpProcessor implements IHttpProcessor {


    public OkHttpProcessor() {
        okHttpClient = new OkHttpClient();

    }


    private OkHttpClient okHttpClient;


    private String getJsonParams(Map<String, String> map) {
        String jsonParam = "";
        JSONObject jsonObject = new JSONObject();
        try {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jsonObject.put(entry.getKey(), entry.getValue());
                }
            }
            jsonParam = jsonObject.toString();
        } catch (Exception e) {
        }
        return jsonParam;
    }

    public static final MediaType MEDIA_TYPE_MARKDOWN = MediaType
            .parse("text/x-markdown; charset=utf-8");


    @Override
    public void get(String path, IHttpCallback callback) {


        ThreadPool.run(new Runnable() {
            @Override
            public void run() {
                Request request = new Request.Builder()
                        .url(path)
                        .get()
                        .build();

                try {
                    okhttp3.Response execute = okHttpClient.newCall(request).execute();
                    callback(execute, callback);

                    execute.body().close();
                } catch (Exception e) {
                    NM_L.d("OkHttpProcessor e = " + e);
                    if (callback != null) {
                        callback.onFailure("e=" + e, 0);
                    }
                }
            }
        });


    }

    private void callback(okhttp3.Response execute, IHttpCallback callback) {
        if (callback != null) {
            try {
                NM_L.d("");
                if (execute.code() == 200) {
                    String string = execute.body().string();
                    callback.onSuccess(string);
                } else {
                    callback.onFailure(execute.message(), execute.code());
//                    callback.onFailure(execute.body().string(), execute.code());
                }
            } catch (Exception e) {
                callback.onFailure("e=" + e, 0);
            }
        }
    }

    @Override
    public void post(String path, Map<String, String> params, IHttpCallback callback) {

        ThreadPool.run(new Runnable() {
            @Override
            public void run() {

                FormBody.Builder builder=new FormBody.Builder();
                for(Map.Entry<String,String> entry:params.entrySet()){
                    builder.add(entry.getKey(),entry.getValue());
                }

                NM_L.d("");
                String req = getJsonParams(params);
                NM_L.d(" post  req = " + req);

                Request request = new Request.Builder()
                        .url(path)
//                        .post(RequestBody.create(MEDIA_TYPE_MARKDOWN, req))
                        .post(builder.build())

                        .build();
                NM_L.d("");

                try {
                    okhttp3.Response execute = okHttpClient.newCall(request).execute();
                    callback(execute, callback);
                } catch (Exception e) {
                    NM_L.d("OkHttpProcessor post e = " + e);
                    if (callback != null) {
                        callback.onFailure("e=" + e, 0);
                    }
                }
            }
        });
    }
}
