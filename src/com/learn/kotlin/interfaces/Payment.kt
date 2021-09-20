package com.learn.kotlin.interfaces

interface Payment {
    val paymentMode: String

    fun deposit(acNum: String, acHolderName: String): Boolean

    fun withdrawal(acNum: String, acHolderName: String): Boolean = false
}