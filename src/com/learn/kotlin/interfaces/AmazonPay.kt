package com.learn.kotlin.interfaces

interface AmazonPay: Payment {

    fun partPay(enabled: Boolean): String
}