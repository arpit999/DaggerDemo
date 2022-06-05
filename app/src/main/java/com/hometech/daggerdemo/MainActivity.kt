package com.hometech.daggerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hometech.daggerdemo.car.Car
import com.hometech.daggerdemo.di.CarComponents
import com.hometech.daggerdemo.di.DaggerCarComponents
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponents: CarComponents = DaggerCarComponents.create()

        carComponents.inject(this)
        car.drive()

    }
}