package com.learn

fun main(args: Array<String>) {

    var emp1 = Employee("Mukesh", 1)
    var emp2 = Employee("Sonam", 2)
    var emp3 = Employee("Sonam", 2)
    var emp4 = emp1
    println(emp1 === emp2)
    println(emp2 === emp3)
    println(emp1 === emp4)
    println(emp1 == emp2)
    println(emp2 == emp3)

}