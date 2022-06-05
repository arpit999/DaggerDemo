package com.hometech.daggerdemo.car

import dagger.Provides
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        println("Diesel engine started.....")
    }

}