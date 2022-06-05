package com.hometech.daggerdemo.di

import com.hometech.daggerdemo.car.Rims
import com.hometech.daggerdemo.car.Tires
import com.hometech.daggerdemo.car.Wheel
import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    // Configure property before returning that object.
    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    //Above two method can create Rims & Tires now we can use those to Create our Wheel object.
    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheel {
        return Wheel(rims, tires)
    }


}