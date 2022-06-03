package com.hometech.daggerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hometech.daggerdemo.di.CarComponents
import com.hometech.daggerdemo.di.DaggerCarComponents
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponents: CarComponents = DaggerCarComponents.create()

        val car = carComponents.getCar()
        car.drive()

    }
}