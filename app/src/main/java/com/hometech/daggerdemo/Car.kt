package com.hometech.daggerdemo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheels: Wheels, val engine: Engine) {
    private val Any.TAG: String get() = this::class.java.simpleName

    fun drive() {
        Log.d(TAG, "driving.....")
    }
}