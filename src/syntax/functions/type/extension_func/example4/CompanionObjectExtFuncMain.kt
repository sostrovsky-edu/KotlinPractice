package syntax.functions.type.extension_func.example4

import java.util.*

fun main(args: Array<String>) {
    for (index in 1..10)
        println("Random value[$index]: ${Int.random()}")
}

fun Int.Companion.random(): Int {
    val random = Random()
    return random.nextInt()
}