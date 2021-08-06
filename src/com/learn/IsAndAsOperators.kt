package com.learn

fun main(args: Array<String>) {

    // Any behaves like Object class of java, but they are not exactly same
    var emp: Any = Employee("John", 1)

    println(emp)

    // Use case 1
    if(emp is Employee) {
        val newEmp = emp as Employee        // as Employee is blurred because of smart casting concept of Kotlin
        newEmp.id = 2
    }

    println(emp)

    // Use case 2
    // We can replace last if block like this.
    if(emp is Employee) {
        emp.name = "Mark"                   // Just because of Smart Casting, compiler is able to interpret emp as Employee automatically
    }

    println(emp)

    // Use case 3
    // Assigning another employee reference in if block
    val emp1 = Employee("Johny", 4)
    if(emp is Employee) {
        emp = emp1
        emp.name = "Mark"                   // Now compiler know about the type of emp variable, so it can assign another employee type Instance
    }

    println(emp)

    // Use case 4
    // Assigning another Any type variable holding employee reference
    val emp2: Any = Employee("Lionel", 5)
    if(emp is Employee) {
        emp = emp2
       //emp.name = "Mark"                   // Bad luck, it is a compilation error because compiler because comipler do not know about exact type of
                                             // emp2. So it can be fixed by simply checking (emp is Employee && emp2 is Employee)
    }
}