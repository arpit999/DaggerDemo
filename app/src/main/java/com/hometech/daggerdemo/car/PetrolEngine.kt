package com.hometech.daggerdemo.car

import dagger.Provides
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine{

    override fun start() {
        println("Petrol engine started....")
    }
}