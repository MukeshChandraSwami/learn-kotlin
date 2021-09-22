package com.learn.kotlin.`object`.singletons

fun main() {

    val s1 = Singletons
    val s2 = Singletons

    println(s1)
    println(s2)

    println(s1 === s2)
}

object Singletons {

    override fun toString(): String {
        return "I am singleton type."
    }
}