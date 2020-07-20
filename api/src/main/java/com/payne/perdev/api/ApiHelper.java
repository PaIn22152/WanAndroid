package com.payne.perdev.api;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.api
 * Date       2020/07/20 - 15:26
 * Author     Payne.
 * About      类描述：
 */
public class ApiHelper {

    public static final class Builder {
        private String baseUrl;

        public Builder baseUrl(String url) {
            baseUrl = url;
            return this;
        }

        public ApiHelper build() {
            return new ApiHelper();
        }
    }


    public <T> T create(final Class<T> service) {
        return null;
    }
}
