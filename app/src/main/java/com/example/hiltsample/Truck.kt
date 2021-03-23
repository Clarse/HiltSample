package com.example.hiltsample

import javax.inject.Inject

class Truck @Inject constructor() {

    fun deliver() {
        println("Truck is delivering cargo.")
    }

}