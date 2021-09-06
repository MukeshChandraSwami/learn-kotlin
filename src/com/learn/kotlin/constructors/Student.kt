package com.learn.kotlin.constructors

class Student(val name: String, val rollNum: Int, val schoolName: String="D.P.S.") {

    fun printData() : Unit {
        println("School Name :- ${schoolName}, Name :- ${this.name}, Roll Number :- ${this.rollNum}")
    }
}