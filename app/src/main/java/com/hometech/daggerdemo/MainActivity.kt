package com.hometech.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var carComponents: CarComponent
    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carComponents = DaggerCarComponent.create()

        carComponents.inject(this)
//        car = carComponents.getCar()

        car.drive()

    }
}