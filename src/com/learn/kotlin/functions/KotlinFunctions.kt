package com.learn.kotlin.functions

class KotlinFunctions {

    // Fun no return type
    fun printSum(a: Int, b: Int, label: String) {
        println("$label ${a + b}")
    }

    // Fun with return type
    fun returnSum(a: Int, b: Int): Int {
        return a + b
    }

    // Single expression function
    fun square(a: Int) = a * a

    // Single expression function with Unit return type
    fun double(a: Int) = println("Double is:- ${a * 2}")
}