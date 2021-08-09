package com.learn.kotlin.array

import com.learn.kotlin.Employee

fun main(args: Array<String>) {

    val array = Array(2) {i -> i}

    for (num in array)
        println(num)

    val intArr = Array(3) { i -> i}
    val floatArr = Array(3) { i -> i + 1.5F}
    val stringArr = Array(3) { i -> "Roll Number :- $i"}
    val empArray = Array(3) {i -> Employee("John", i) }

    println("""Integer array :-  ${intArr is Array<Int>}""")
    println("Floating point array :-  ${floatArr is Array<Float>}")
    println("String array :-  ${stringArr is Array<String>}")
    println("Employee array :-  ${empArray is Array<Employee>}")
}