package com.learn.kotlin.constructors

class Student(val name: String, val rollNum: Int, val schoolName: String="D.P.S.") {

    var section: Char = '-'

    constructor(name: String, rollNum: Int, section: Char) : this(name, rollNum) {
        this.section = section
    }

    constructor(name: String, rollNum: Int, section: Char, schoolName: String) : this(name, rollNum, schoolName) {
        this.section = section
    }

    constructor(rollNum: Int) : this("Anonymous", rollNum, 's') {
        // this constructor is calling another secondary constructor
    }

    fun printData() : Unit {
        println("School Name :- ${schoolName}, Name :- ${this.name}, Roll Number :- ${this.rollNum}, Section :- ${checkSection()}")
    }

    fun checkSection(): String {
        if (this.section == '-') {
            return "None"
        }
        return this.section.toString()
    }
}