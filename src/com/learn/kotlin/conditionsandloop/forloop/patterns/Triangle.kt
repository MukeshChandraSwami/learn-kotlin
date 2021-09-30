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
    println("\nTriangle 2 \n")
    triangle2(size)

    /*
            *
          * *
        * * *
      * * * *
    * * * * *
    */
    println("\nTriangle 3 \n")
    triangle3(size)

    /*
    * * * * *
      * * * *
        * * *
          * *
            *
     */

    println("\nTriangle 4 \n")
    triangle4(size)

    /*
        *
       * *
      * * *
     * * * *
    * * * * *
    */
    println("\nTriangle 5 \n")
    triangle5(size)

    /*
    * * * * *
     * * * *
      * * *
       * *
        *
    */
    println("\nTriangle 6 \n")
    triangle6(size)

    /*
        *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *
    */
    println("\nTriangle 7 \n")
    triangle7(9)

    /*
        *
       ***
      *****
     *******
    *********
    */
    println("\nTriangle 8 \n")
    triangle8(5)

    /*
    *********
     *******
      *****
       ***
        *
    */
    println("\nTriangle 9 \n")
    triangle9(5)

    /*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
    */
    println("\nTriangle 10 \n")
    triangle10(9)

    /*
        *
       **
      ***
     ****
    *****
     ****
      ***
       **
        *
    */
    println("\nTriangle 11 \n")
    triangle11(9)
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

fun triangle7(size:Int) {
    for(i in 0 until size) {
        for(j in 0 until size) {
            if(i + j in 4..12 && j - i <= 4 && i - j <= 4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun triangle8(size: Int) {

    for(i in 0 until size) {
        for(j in 0 until size * 2) {
            if(i + j in 4..12 && j - i <= 4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun triangle9(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until size * 2) {
            if(i + j <= 8 && i -j <= 0)
                print("*")
            else
                print(" ")
        }
        println()
    }
}

fun triangle10(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until (size / 2) + 1) {
            if(i + j <= 8 && j - i <= 0)
                print("*")
        }
        println()
    }
}

fun triangle11(size: Int) {
    for(i in 0 until size) {
        for(j in 0 until (size / 2) + 1) {
            if(i + j in 4..12 && i - j <= 4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
