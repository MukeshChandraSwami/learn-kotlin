package com.learn.kotlin.array

fun main(args: Array<String>) {

    val arr = Array<Int>(5) {0}

    arr.set(1, 5)

    for (n in 0..arr.size - 1) {
        println(arr.get(n))
    }
}