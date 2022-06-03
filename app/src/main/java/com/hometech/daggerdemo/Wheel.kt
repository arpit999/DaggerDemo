package com.hometech.daggerdemo

import javax.inject.Inject

//Assume We can not own this class so we can not annotate @Inject on my wheel class (In most cases that our third party library)
class Wheel(tires: Rims, rims: Tires) {

}