package com.learn.kotlin.conditionsandloop.whenexpression


fun main() {
    expressionAsBranchCondition(10)
}

fun expressionAsBranchCondition(num: Int) {
    val x = 20
    when(num) {
        x.plus(10) -> println("Number is equals to x after increasing it by 10")
        x.minus(10) -> println("Number is equals to x after decreasing it by 10")
        x.div(10) -> println("Number is equals to x after dividing it by 10")
    }
}