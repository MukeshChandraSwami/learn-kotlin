package com.learn.kotlin.array

import com.learn.java.TestClass

fun main() {

    // Calling java method with typed int array
    val intTypedArr = Array(3) { i -> i * 2}
    TestClass.printArray(intTypedArr.toIntArray())

    // Calling java method with factory int array
    val intArray = arrayOf(1,2,3,4)
    TestClass.printArray(intArray.toIntArray())

    val buildInIntArray = intArrayOf(1,2,34,5,5,6)
    TestClass.printArray(buildInIntArray)
}