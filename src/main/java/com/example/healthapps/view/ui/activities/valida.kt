package com.example.healthapps.view.ui.activities


import android.text.TextUtils
import android.util.Patterns


fun String.isValiduser(): Boolean {
    return !TextUtils.isEmpty(this)&&  Patterns.EMAIL_ADDRESS.matcher(this ).matches()
}
fun String.isValidpassword():Boolean{
    return this.length >= 8
}