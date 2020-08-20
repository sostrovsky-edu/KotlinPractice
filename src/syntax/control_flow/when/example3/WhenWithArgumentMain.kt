package syntax.control_flow.`when`.example3

import kotlin.math.abs
import kotlin.random.Random

fun main(args: Array<String>) {
    val number = Random.nextInt(0, 10) + 1
    val str = "Football"
    println("\nThe number \"$number\": ")
    whatNumber(number)

    println("\nThe number \"$number\" is min or max: " +
            "\n${isMinOrMax(number)}")

    println("\nThe number \"$number\" is zero or one: " +
            "\n${isZeroOrOne(number)}")

    println("\nThe number \"$number\" is abs: " +
            "\n${isAbs(number)}")

    println("\nThe number \"$number\" is single digit: " +
            "\n${isSingleDigit(number)}")

    println("\nThe number \"$number\" is collection number: " +
            "\n${isCollectionNumber(number)}")

    println("\nThe string \"$str\" starts from \"Foo\": " +
            "\n${startsWithFoo(str)}")
}

// The simplest example of "when" is matching against different constants, which will be familiar as the typical
// usage of "switch" in a language like Java.
fun whatNumber(x: Int) {
    when (x) {
        0 -> println("x is zero")
        1 -> println("x is 1")
        else -> println("X is neither 0 or 1")
    }
}

// Similar to "if...else" and "try..catch", "when" can be used as an expression, and so the result of the evaluated
// branch is the result that is returned.
fun isMinOrMax(x: Int): Boolean {
    return when (x) {
        Int.MIN_VALUE -> true
        Int.MAX_VALUE -> true
        else -> false
    }
}

// Constants can be combined together if the branch code is the same.
// To do this, we simply use a comma to separate constants.
fun isZeroOrOne(x: Int): Boolean {
    return when (x) {
        0, 1 -> true
        else -> false
    }
}

// We can use any function that returns the same type as the type being matched on. The function is invoked,
// and if the result matches the value, then that branch is evaluated.
fun isAbs(x: Int): Boolean {
    return when (x) {
        abs(x) -> true
        else -> false
    }
}

// Ranges are also supported.
// We can use the "in" operator to verify whether the value is included in the range, and if so, the condition is
// evaluated to "true"
fun isSingleDigit(x: Int): Boolean {
    return when (x) {
        in -9..9 -> true
        else -> false
    }
}

// Along a similar line, we can use "in" to verify whether the value is contained in a collection:
fun isCollectionNumber(x: Int): Boolean {
    return when (x) {
        in listOf(1, 2, 3, 4, 5, 6) -> true
        else -> false
    }
}

// Smart casts allow the compiler to verify the runtime type of a variable, and expose it:
fun startsWithFoo(any: Any): Boolean {
    return when (any) {
        is String -> any.startsWith("Foo")
        else -> false
    }
}