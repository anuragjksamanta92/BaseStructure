package com.appsbee.basestructure.activity.main

import android.os.Bundle
import com.appsbee.basestructure.base.BaseActivity
import com.appsbee.basestructure.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
