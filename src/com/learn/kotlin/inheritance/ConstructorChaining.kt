package com.learn.kotlin.inheritance

fun main(args: Array<String>) {
    val child = Child("John", 98, "Near home town", "9876543210")
}

open class GrandParent {

    val name: String
    var age: Int


    constructor(name: String){
        println("I am grand parent with default age.")
        this.name = name
        this.age = 90
    }

    constructor(name: String, age: Int) : this(name) {
        println("I am grand parent with custom name and age.")
        this.age = age
    }
}

open class Parent: GrandParent {

    val address: String
    constructor(name: String, age: Int, address: String): super(name, age) {
        println("I am parent having address details.")
        this.address = address
    }
}

open class Child(val n: String, val a: Int, val add: String): Parent(n, a, add) {

    var mobile: String? = null
    constructor(n: String, a: Int, add: String, mobile: String) :this(n, a, add) {
        println("I am child having mobile details")
        this.mobile = mobile
    }
}