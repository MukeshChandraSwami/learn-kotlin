package com.learn

class Employee (var name:String, var id:Int) {

    override fun equals(other: Any?): Boolean {
        if(other is Employee)
            return this.name == other.name && this.id == other.id

        return false
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}