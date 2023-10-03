package com.xynos.toastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xynos.mylibrary.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.show(this, "Hello Toast")
    }
}