package com.learn.kotlin.array

fun main() {

    // Creating array by using arrayOf() function.

    val intArr = arrayOf(1,2,3)     // Integer type array
    val stringArr = arrayOf("Name", "Sir Name", "Contact Number")      // String type array

    val byteArray1: Array<Byte> = arrayOf(1,2,3,4)   // Defining type explicitly at the time of declaration

    val byteArray2 = arrayOf<Byte>(1,2,3,4)   // Defining type explicitly at the time of declaration

    val byteArray3: Array<Byte> = arrayOf<Byte>(1,2,3,4)   // Defining type explicitly at the time of declaration


    for(a in byteArray1) {
        println(a)
    }

    // Creating array by built in factory methods
    val dblArray = doubleArrayOf(1.5, 1.7)      // Creates a double type array
    val fltArray = floatArrayOf(1.5F, 1.7F)     // Creates a float type array
    val longArray =  longArrayOf(1, 2, 3)       // Creates a long type array
    val iArray = intArrayOf(1, 2, 3)            // Crates an integer type array
    val shortArray = shortArrayOf(1, 2, 3)      //Crates a Short type array
    val byteArray = byteArrayOf(1, 2, 3)        //Crates a Byte type array
    val charArray = charArrayOf('a', '2', '3')  //Crates a character type array


}