package com.payne.perdev.net.okhttp;

import com.payne.perdev.net.NM_L;
import com.payne.perdev.net.interfaces.IHttpFactory;
import com.payne.perdev.net.interfaces.IHttpProcessor;

/**
 * Project    WanAndroid
 * Path       com.payne.perdev.net.okhttp
 * Date       2020/07/13 - 18:09
 * Author     Payne.
 * About      类描述：
 */
public class OkHttpFactory implements IHttpFactory {


    @Override
    public IHttpProcessor createProcessor() {
        return new OkHttpProcessor();
    }
}
