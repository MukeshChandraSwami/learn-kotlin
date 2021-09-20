package com.learn.kotlin.interfaces

class Pay(override val paymentMode: String) : PaytmPayment, AmazonPay {

    override fun partPay(enabled: Boolean): String {
        // super<PaytmPayment>.withdrawal("Ac Number","Ac Holder Name")
        // super<AmazonPay>.withdrawal("Ac Number","Ac Holder Name")

        if(enabled)
            return "Enabled"
        return "Not Enabled"
    }

    override fun deposit(acNum: String, acHolderName: String): Boolean {
        TODO("Not yet implemented")
    }

}