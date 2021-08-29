package com.learn.kotlin.nullreference

fun main() {

    val name: String? = "John"

    println(name!!.uppercase())

    val lastName: String? = null
    //println(lastName!!.uppercase())         // Will throw NullPointerException

    printIt(lastName!!)
}

fun printIt(data:String) : Unit {
    println(data)
    println(data.length)
}