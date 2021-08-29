package com.learn.kotlin.nullreference

import com.learn.kotlin.Employee

fun main() {

    val name: String? = null
    println("Uppercase to null variable :- ${name?.uppercase() ?: "Name is null"}")     // Elvis operator if name is null.

    val emp: Employee? = null

    println(emp?.name)                                                                 // Print name of emp has employee details. Otherwise, it will print null
}