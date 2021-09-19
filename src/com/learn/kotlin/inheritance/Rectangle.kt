package com.learn.kotlin.inheritance

class Rectangle(val height: Int, val width: Int): Shape("Rectangle") {

    override fun area() {
        println("Area of ${super.name} :- ${this.height * this.width}")
    }
}