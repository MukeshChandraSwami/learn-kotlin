package com.learn.kotlin.functions.extentionfun

import com.learn.kotlin.Employee

fun main() {
    val name = "johny is not working"
    println(name.toCamelCase())

    val emp1 = Employee("John",101)
    val emp2 = emp1.createDuplicate()

    println(emp1.id == emp2.id && emp1.name.equals(emp2.name))
}