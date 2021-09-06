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

    println("--------------------------------------------------------------------")

    // Instantiating class via 3 arg constructor having default schooling
    val student3 = Student("Andrew", 103, 'a')
    println("Printing data via method in class")
    student3.printData()

    println("\n\nPrinting data via accessing data members")
    println("School Name :- ${student3.schoolName}, Name :- ${student3.name}, Roll Number :- ${student3.rollNum}, Section :- ${student3.checkSection()}")

    println("--------------------------------------------------------------------")

    // Instantiating class via 3 arg constructor having default schooling
    val student4 = Student("Linda", 104, 'b', "K.V.")
    println("Printing data via method in class")
    student4.printData()

    println("\n\nPrinting data via accessing data members")
    println("School Name :- ${student4.schoolName}, Name :- ${student4.name}, Roll Number :- ${student4.rollNum}, Section :- ${student4.checkSection()}")

    println("--------------------------------------------------------------------")

    // Constructor chaining
    val student5 = Student( 105)
    println("Printing data via method in class")
    student5.printData()

    println("\n\nPrinting data via accessing data members")
    println("School Name :- ${student5.schoolName}, Name :- ${student5.name}, Roll Number :- ${student5.rollNum}, Section :- ${student5.checkSection()}")
}