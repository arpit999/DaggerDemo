package com.hometech.daggerdemo.di

import com.hometech.daggerdemo.Car
import com.hometech.daggerdemo.MainActivity
import dagger.Component

@Component(modules = [WheelModule::class])
interface CarComponents {

    fun getCar(): Car

    fun getInstance(mainActivity: MainActivity)
}