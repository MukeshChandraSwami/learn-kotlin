package com.learn.kotlin.datatypes

fun main(args: Array<String>) {

    var byte: Byte = 127
    var short: Short = 32767
    var int: Int = 2147483647       // By-default everything is in Int
    var long: Long = 9223372036854775807

    var autoLong = 30L              // Specify L to make it long

    var v: Long = int + long        // Resultant value is in long automatically

    println(v)

    autoLong = int.toLong()         // Long can not hold int, so have to convert in long and wise versa


    println("Result :- ${3L/2}")     // Result will always be in int

    println(10.equals(10L))         // int 10 and long 10 are not equal because of their type.

}