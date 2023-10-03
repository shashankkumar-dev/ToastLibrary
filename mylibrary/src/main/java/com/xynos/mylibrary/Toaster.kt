package com.xynos.mylibrary

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun show(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}