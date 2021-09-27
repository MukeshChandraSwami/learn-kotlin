package com.learn.kotlin.conditionsandloop.ifexpression

import com.learn.kotlin.enums.Gender
import java.lang.RuntimeException

fun main() {

    val gender: Gender = getGender((1..3).random())

    val buildingNum = getBuildingNumber(gender)

    println("Building Number for ${gender.name}: $buildingNum")
}

fun getGender(random: Int): Gender {

    return when(random) {
        1 -> Gender.MALE
        2 -> Gender.FEMALE
        3 -> Gender.TRANS
        else -> throw RuntimeException("Invalid number : $random")
    }
}

fun getBuildingNumber(gender: Gender): Int {

    return if (gender == Gender.MALE){
        Gender.MALE.buildingNumber()
    } else{
        if (gender == Gender.FEMALE) Gender.FEMALE.buildingNumber() else Gender.TRANS.buildingNumber()
    }
}

