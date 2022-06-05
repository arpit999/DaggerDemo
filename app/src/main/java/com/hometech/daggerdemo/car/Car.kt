package com.hometech.daggerdemo.car

import javax.inject.Inject


class Car @Inject constructor(wheel: Wheel, engine: Engine) {

    fun drive() {
        println("Driving Car.....")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }
}