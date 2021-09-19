package com.learn.kotlin.inheritance

class Cube(val s: Int): Square(s,"Cube") {

    override fun area() {
        println("Area of ${super.name} :- ${this.side * this.side}")
    }
}