package com.hometech.daggerdemo.di

import com.hometech.daggerdemo.car.Engine
import com.hometech.daggerdemo.car.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine

}