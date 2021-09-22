package com.learn.kotlin.`object`.companionobj

fun main(args: Array<String>) {
    println(CompanionObject.Companion)
    println(CompanionObject.SingletonCompanion)
    println(CompanionObject.SingletonCompanion)
    println(CompanionObject.SingletonCompanion)

    // Check if singleton object
    println(CompanionObj.InterfaceCompanion)
    println(CompanionObj.InterfaceCompanion)
    println(CompanionObj.InterfaceCompanion)

    // Inheritance with companion objects
}


class CompanionObject {

    companion object {

        private val schoolName: String = "D.A.V."

        fun getSchoolName(): String {
            return this.schoolName
        }
    }

    object SingletonCompanion {
        fun getSchoolName(): String {
            return schoolName
        }
    }
}

interface CompanionObj {

    companion object InterfaceCompanion{

        private val schoolName: String = "D.A.V."

        fun getSchoolName(): String {
            return this.schoolName
        }
    }
}

abstract class CompanionInheritanceTest: CompanionObj {
    
}

open class Factory private constructor(val factoryType: String) {

    companion object Mango: Factory("Mango") {


    }
}