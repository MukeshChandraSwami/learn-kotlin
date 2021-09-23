package com.learn.kotlin.`object`.anonymousobject

fun main() {
    val printerDef = PrinterDef()
    println("Printer Details: ${printerDef.printerDetails(object: Printer {
        override fun name(): String = "A12C"
        override fun brand(): String = "HP"
    } 
    )}")
}

interface Printer {
    fun name(): String
    fun brand(): String
}

class PrinterDef {

    fun printerDetails(printer: Printer) = "Name :- ${printer.name()}, Brand: ${printer.brand()}"

}