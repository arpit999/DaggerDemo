package com.hometech.daggerdemo.car

//Assume We can not own this class so we can not annotate @Inject on my wheel class (In most cases that our third party library)
class Wheel(tires: Rims, rims: Tires) {

}