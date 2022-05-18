package com.hometech.daggerdemo

import dagger.Component

@Component
interface CarComponents {

    fun getCar():Car
}