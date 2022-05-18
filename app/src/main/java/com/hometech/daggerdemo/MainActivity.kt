package com.hometech.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated

class MainActivity : AppCompatActivity() {

    lateinit var carComponents: CarComponents
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carComponents = DaggerCarComponents.create()

        car = carComponents.getCar()

        car.drive()

    }
}