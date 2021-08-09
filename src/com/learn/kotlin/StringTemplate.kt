package com.learn.kotlin

fun main(args: Array<String>) {

    val a = 10
    val b = 5

    // Simply printing these variables
    println("a is $a and b is $b")        // We do not need to go for concatenation and format() of java

    // Mathematical operation or expression support via String template
    println("Sum of $a and $b is ${a+b}")

    // Let suppose a price declaration in dollar.
    val price = 10.50
    println("Price is $$price")           // Compiler is smart enough to identify use of $

    // Lets check instance variable behaviour
    val emp = Employee("John", 2)
    println("Employee name is :- ${emp.name}")     // We have to go for expression format to access any data from any object

    val emp2 = Employee("Sum of $a and $b is ${a+b}", 3)
    println("Employee name is :- ${emp2.name}")

    println(emp2)

}