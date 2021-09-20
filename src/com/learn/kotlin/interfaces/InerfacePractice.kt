package com.learn.kotlin.interfaces

fun main() {
    val paytmPayment: PaytmPayment = Pay("WALLET")
    println(paytmPayment.partPay(true))

    val amazonPay: AmazonPay = Pay("NetBanking")
    println(amazonPay.partPay(false))
}