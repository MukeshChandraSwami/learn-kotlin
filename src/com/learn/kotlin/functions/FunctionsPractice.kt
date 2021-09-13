package com.learn.kotlin.functions

fun main(args: Array<String>) {

    val functionPractice = KotlinFunctions()
    functionPractice.printSum(12,23,"Sum is:")

    println("Sum is: ${functionPractice.returnSum(23, 45)}")

    println("Square is: ${functionPractice.square(10)}")

    functionPractice.double(20)
}