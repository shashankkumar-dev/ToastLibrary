package com.xynos.toastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xynos.analyticservice.service.LOG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LOG.init(this)
    }
}