package com.learn.kotlin.conditionsandloop.forloop.patterns

fun main() {

    val size: Int = 10
    printSquare(size)
}

fun printSquare(size: Int) {

    for(i in 0 until size) {
        for(j in 0 until size) {
            print("* ")
        }
        println()
    }
}
