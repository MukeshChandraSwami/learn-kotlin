package com.learn.kotlin.conditionsandloop.forloop.patterns

fun main() {

    val size = 10

    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    println("Triangle 1 \n")
    triangle1(size)

    /*
    * * * * *
    * * * *
    * * *
    * *
    *
     */
    /*println("\nTriangle 2 \n")
    triangle2(size)*/

    /*
            *
          * *
        * * *
      * * * *
    * * * * *
    */
    /*println("\nTriangle 3 \n")
    triangle3(size)*/

    /*
    * * * * *
      * * * *
        * * *
          * *
            *
     */

    /*println("\nTriangle 4 \n")
    triangle4(size)*/

    /*
        *
       * *
      * * *
     * * * *
    * * * * *
    */
    /*println("\nTriangle 5 \n")
    triangle5(size)*/

    /*
    * * * * *
     * * * *
      * * *
       * *
        *
    */
    /*println("\nTriangle 6 \n")
    triangle6(size)*/
}

fun triangle1(size: Int) {

    for(i in 0 until size) {
        for(j in 0 until size) {
            if(i >= j) {
                print("* ")
            }
        }
        println()
    }
}

fun triangle2(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until size) {
            if(i + j < size)
                print("* ")
        }
        println()
    }
}

fun triangle3(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until size) {
            if(i + j >= size - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun triangle4(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until size) {
            if(j >= i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun triangle5(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until size) {
            if(i + j >= size - 1) {
                print("* ")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun triangle6(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until size) {
            if(j >= i) {
                print("* ")
            } else {
                print(" ")
            }
        }
        println()
    }
}
