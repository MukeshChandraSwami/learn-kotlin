package com.learn.kotlin.backingfield

class BackingFields {

    var nameOfField: String = "No Name"
    get() {
        println("Custom get")
        return field
    }
    set(value) {
        println("Custom Set")
        field = value
    }

    public fun printData(): Unit {
        println(this.nameOfField)           // Custom get will be called before accessing this property.
    }
}