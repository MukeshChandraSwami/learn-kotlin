package com.learn.kotlin.constructors

fun main(args: Array<String>) {

    // Instantiating class via 2 arg constructor
    val student1 = Student("John", 101)
    println("Printing data via method in class")
    student1.printData()

    println("\n\nPrinting data via accessing data members")
    println("School Name :- ${student1.schoolName}, Name :- ${student1.name}, Roll Number :- ${student1.rollNum}")

    println("--------------------------------------------------------------------")

    // Instantiating class via 3 arg constructor
    val student2 = Student("Robert", 102, "K.V.")
    println("Printing data via method in class")
    student2.printData()

    println("\n\nPrinting data via accessing data members")
    println("School Name :- ${student2.schoolName}, Name :- ${student2.name}, Roll Number :- ${student2.rollNum}")
}