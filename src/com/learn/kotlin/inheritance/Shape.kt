package com.learn.kotlin.inheritance

abstract class Shape(val name: String) {

    open fun geometryType() {
        println(this.name)
    }

    abstract fun area()
}