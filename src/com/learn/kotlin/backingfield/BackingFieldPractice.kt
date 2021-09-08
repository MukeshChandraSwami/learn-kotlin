package com.learn.kotlin.backingfield

fun main(args: Array<String>) {

    val backingFields: BackingFields = BackingFields()

    println("Calling Custom get:- ${backingFields.nameOfField}")

    backingFields.nameOfField = "New name assigned"

    println("Calling Custom get:- ${backingFields.nameOfField}")
}