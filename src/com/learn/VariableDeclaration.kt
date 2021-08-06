package com.learn

fun main(args: Array<String>) {

    // Mutable variable declaration via VAR
    var i1 = 10;
    var i2: Int = 10;
    var i3: Int         // Can not be used without initializing it.

    var s1 = "Kotlin 1.1"
    var s2: String = "Kotlin 1.1"

    var e1 = Employee("Mukesh", 120092)
    var e2: Employee = Employee("Mukesh", 120092)

    // Immutable variable declaration via VAL

    val im1 = 100
    // im1 = 200        ->      It is not possible to re-assign this variable. It is a compilation error.

    val em = Employee("John",120092)
    em.id = 200       //->      Yes, we can change the value of member variables of any reference type variable.

    //em = Employee("Poll", 120092)     ->      But re-assigning a new value is not allowed. It is again a compilation error.

}