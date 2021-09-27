package com.learn.kotlin.conditionsandloop.whenexpression

fun main() {

    val num = 53
    checkOneValue(num)

    checkingMoreThanOneValue(num)

    checkingInRange(num)
}

// Simple switch statement like representation
fun checkOneValue(num: Int) {
    when(num) {
        5 -> println("Number is 5")
        10 -> println("Number is 10")
        15 -> println("Number is 15")
        else -> println("Number is not recognised")
    }
}

// Checking more than one value in single case/option
fun checkingMoreThanOneValue(num: Int) {
    when(num) {
         5 -> println("Number is 5")
        10 -> println("Number is 10")
        15 -> println("Number is 15")
        20,25,30 -> println("Number is in 20,25,30")
        else -> println("Number is not recognised")
    }
}

// Checking in ranges along with comma list and single value
fun checkingInRange(num: Int) {

    when(num) {
        in 5..30 -> println("Number is in range of 5 to 30")
        in 30..50 -> println("Number is in range of 30 to 50")
        51,52,53,54,55 -> println("Number is in 51,52,53,54,55")
        56 -> println("Number is 56")
        else -> println("Number is not recognised")
    }
}