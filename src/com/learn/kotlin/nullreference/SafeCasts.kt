package com.learn.kotlin.nullreference

fun main(args: Array<String>) {

    val intArray: Any = arrayOf(1,2,3,4,5)

    val str = intArray as? String

    println(str)

    val str1 = intArray as? String ?: "Operation failed! I am default"

    println(str1)


}