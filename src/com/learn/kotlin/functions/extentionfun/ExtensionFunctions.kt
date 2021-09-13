package com.learn.kotlin.functions.extentionfun

import com.learn.kotlin.Employee


fun String.toCamelCase(): String {
    var str = ""

    for (s in this.split(" ")) {
        var c = s.substring(0,1).uppercase() + s.substring(1, s.length)
        str += "$c "
    }
    return str.trim()
}

fun Employee.createDuplicate() = Employee(this.name, this.id)


