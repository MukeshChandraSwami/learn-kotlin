package com.learn.kotlin

fun main() {

    // Use case 1
    // Double slashes
    val filePathJava = "C:\\users\\mswami\\dev\\reports\\jan.excel"
    val filePath = """C:\users\mswami\dev\reports\jan.excel"""

    println(filePathJava)
    println(filePath)

    // Use Case 2
    // No new line character required
    val nameStory = """My name is khan.
        |I lives in Nepal.
        |Nepal is good country.
        |But PM is not good.
    """.trimMargin()

    println(nameStory)
}