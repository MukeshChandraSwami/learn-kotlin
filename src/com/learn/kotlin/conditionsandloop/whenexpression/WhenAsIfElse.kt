package com.learn.kotlin.conditionsandloop.whenexpression

import com.learn.kotlin.functions.extentionfun.isEven
import com.learn.kotlin.functions.extentionfun.isOdd

fun main() {

    whenAsReplacementOfIfAndElse((1..1000).random())
}

fun whenAsReplacementOfIfAndElse(num: Int) {

    when {
        num.isOdd() -> println("$num is an odd number")
        num.isEven() -> println("$num is an even number")
    }
}