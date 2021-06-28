package syntax.functions.type.extension_func.example5

import syntax.functions.type.extension_func.example5.lastChar as last

fun main () {
    val str = "Kotlin"

    // before import
    // println("Last character of the $str is: ${str.lastChar()}")\

    // after import
    println("Last character of the $str is: ${str.last()}")
}