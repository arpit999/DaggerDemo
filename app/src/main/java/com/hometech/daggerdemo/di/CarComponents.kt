package com.hometech.daggerdemo.di

import com.hometech.daggerdemo.car.Car
import com.hometech.daggerdemo.MainActivity
import com.hometech.daggerdemo.car.PetrolEngine
import dagger.Component

@Component(modules = [WheelModule::class, PetrolEngineModule::class])
interface CarComponents {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}