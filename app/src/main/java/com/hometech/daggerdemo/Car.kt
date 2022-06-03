package com.hometech.daggerdemo

import javax.inject.Inject

class Car @Inject constructor(wheel: Wheel, engine: Engine) {

    fun drive() {
        println("Driving Car.....")
    }
}