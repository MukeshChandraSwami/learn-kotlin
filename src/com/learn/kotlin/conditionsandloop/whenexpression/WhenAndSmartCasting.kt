package com.learn.kotlin.conditionsandloop.whenexpression

import com.learn.kotlin.Employee

fun main() {
    testingSmartCastingWithWhen("rahul")
}

fun testingSmartCastingWithWhen(any: Any) {

    when(any) {
        is String -> println("${any.uppercase()} :- is a String type value")
        is Int -> println("${any.plus(10)} :- is a Integer type value")
        is Employee -> println("$any :- is a Employee type value")
        is Nothing -> println("$any :- is a Nothing type value")
        is Any -> println("$any :- is not recognised so, it is Any type")
    }
}