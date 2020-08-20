package syntax.functions.type.generic_func.example1

import java.util.*

fun main(args: Array<String>) {
    printRepeated("Hey", 5)
    printRepeated(100, 2)

    println("\nChosen number is: ${choose(5, 7, 9)}")
}

fun <T> printRepeated(t: T, k: Int): Unit {
    println()
    for (x in 1..k) {
        println(t)
    }
}

fun <T> choose(t1: T, t2: T, t3: T): T {
    return when (Random().nextInt(3)) {
        0 -> t1
        1 -> t2
        else -> t3
    }
}