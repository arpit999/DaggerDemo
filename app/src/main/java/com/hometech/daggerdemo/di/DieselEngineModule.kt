package com.hometech.daggerdemo.di

import com.hometech.daggerdemo.car.DieselEngine
import com.hometech.daggerdemo.car.Engine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine

}