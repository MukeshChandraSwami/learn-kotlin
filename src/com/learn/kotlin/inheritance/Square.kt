package com.learn.kotlin.inheritance

open class Square(val side: Int, val shapeType: String = "Square"): Shape(shapeType) {

    override fun geometryType() {
        println("Geometry type is :- ${super.name}")
    }

    override fun area() {
        println("Area of ${super.name} :- ${this.side * this.side}")
    }
}