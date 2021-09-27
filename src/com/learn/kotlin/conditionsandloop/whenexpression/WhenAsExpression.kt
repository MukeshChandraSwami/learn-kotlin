package com.learn.kotlin.conditionsandloop.whenexpression

import com.learn.kotlin.conditionsandloop.ifexpression.getGender
import com.learn.kotlin.enums.Gender

fun main() {

    val gender: Gender = getGender((1..3).random())
    val sector = getSector(gender)
    println(sector)
}

fun getSector(gender: Gender): String {
    return when(gender) {
        Gender.MALE -> {
            println("Getting sector of male")
            gender.sector()
        }
        Gender.FEMALE -> {
            println("Getting sector of female")
            gender.sector()
        }
        Gender.TRANS -> {
            println("Getting sector of trans")
            gender.sector()
        }
    }
}
