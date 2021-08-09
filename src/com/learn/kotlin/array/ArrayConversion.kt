package com.learn.kotlin.array

fun main() {

    // Converting primitive (integer) type array to class type array
    val intArray = intArrayOf(1,2,3,4,5)
    val intTypedArray = intArray.toTypedArray()

    // Converting typed array to primitive array
    val floatTypedArray: Array<Float> = Array(3) { i -> i * 1.3F}
    floatTypedArray.toFloatArray()
}