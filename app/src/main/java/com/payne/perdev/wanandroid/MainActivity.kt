package com.payne.perdev.wanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.payne.perdev.api.ApiModuleTest
import com.payne.perdev.net.NM_L
import com.payne.perdev.net.NetModuleTest
import com.payne.perdev.net.interfaces.IHttpFactory
import com.payne.perdev.net.okhttp.OkHttpFactory
import com.perdev.wanandroid.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        AppTest.test()


    }
}
