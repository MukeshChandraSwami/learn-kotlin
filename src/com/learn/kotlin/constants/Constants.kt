package com.learn.kotlin.constants

const val MIN_PER_VALUE = 0
val MAX_PER_VALUE = Constants().getMaxPer()

class Constants {
    
    fun printMinAndMaxPercentage() {
        println("Min :- ${MIN_PER_VALUE} , Max :- ${MAX_PER_VALUE}")
    }

    public fun getMaxPer(): Int {
        return 100
    }
}