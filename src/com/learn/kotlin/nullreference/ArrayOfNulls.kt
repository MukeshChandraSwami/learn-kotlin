package com.learn.kotlin.nullreference

fun main() {

    val intNullableArray = arrayOfNulls<Int>(3)

    for (i in intNullableArray){
        println(i)
    }
}