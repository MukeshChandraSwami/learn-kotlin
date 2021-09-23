package com.learn.kotlin.`object`.anonymousobject

fun main() {
    val ano = object {
        fun printSomething() {
            println("Something")
        }
    }
    println(ano is Any)
    println(ano)
    println(ano)
}

