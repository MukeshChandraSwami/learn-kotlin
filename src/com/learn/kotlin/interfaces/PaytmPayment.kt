package com.learn.kotlin.interfaces

interface PaytmPayment : Payment {

    fun partPay(enabled: Boolean): String
}