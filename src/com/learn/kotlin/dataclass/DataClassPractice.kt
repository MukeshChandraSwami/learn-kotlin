package com.learn.kotlin.dataclass

fun main() {
    val student1 = StudentDataClass(5, "John", 1)
    println(student1)

    val student2 = student1.copy(rollNum = 2)
    println(student2)

}