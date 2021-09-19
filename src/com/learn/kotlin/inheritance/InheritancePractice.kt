package com.learn.kotlin.inheritance

fun main() {
    val rectangle: Shape = Rectangle(10,20)
    rectangle.geometryType()
    rectangle.area()

    println("-----------------------------------------------------")

    val square: Shape = Square(30)
    square.geometryType()
    square.area()

    println("-----------------------------------------------------")

    val cube: Shape = Cube(20)
    cube.geometryType()
    cube.area()
}