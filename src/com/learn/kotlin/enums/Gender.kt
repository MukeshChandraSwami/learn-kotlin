package com.learn.kotlin.enums

fun main() {
    println(Gender.TRANS.provideGenderSpecificFacilities())
    println("Female -> Sector: ${Gender.FEMALE.sector()} and Building Number: ${Gender.FEMALE.buildingNumber()}")

    println("${Gender.MALE.gender} -> Sector: ${Gender.MALE.sector()} and Building Number: ${Gender.MALE.buildingNumber()}")
}

enum class Gender(var gender: String): GenderSpecificApartments {
    MALE ("Male"){
        override fun provideGenderSpecificFacilities(): Boolean {
            return false
        }

        override fun sector() = "Sector A"

        override fun buildingNumber() = 2
    },
    FEMALE ("Female") {
        override fun provideGenderSpecificFacilities(): Boolean {
            return true
        }

        override fun sector() = "Sector A and B"

        //override fun buildingNumber() = 3
    },
    TRANS("Trans Gender") {
        override fun provideGenderSpecificFacilities(): Boolean {
            return true
        }

        override fun sector() = "Sector D"

        override fun buildingNumber() = 1
    };

    abstract fun provideGenderSpecificFacilities(): Boolean

    override fun buildingNumber() = 10
}

interface GenderSpecificApartments {

    fun sector(): String

    fun buildingNumber(): Int
}
