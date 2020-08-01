package com.payne.perdev.wanandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.perdev.viewlib.widget.TabLayout
import com.perdev.wanandroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val list:ArrayList<String> =ArrayList()
        list.add("tttt1")
        list.add("tttt2")
        list.add("tttt3")
        tl_tab.setTitle(list)


    }
}
