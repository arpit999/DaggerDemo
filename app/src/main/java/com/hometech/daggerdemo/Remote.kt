package com.hometech.daggerdemo

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    public fun setListener(car: Car) {
        Log.d(TAG, "Remote Connected")
    }
}