package syntax.control_flow.keyword.`return`.example2

fun main(args: Array<String>) {
    val number1 = 3
    val number2 = 5
    val number3 = 10

    println("\nThe sum of $number1 and $number2 is: ${addTwoNumbers(number1, number2)}")
    println("\nThe largest number of $number1, $number2 and $number3 is: ${largestNumber(number1, number2, number3)}")

    println()
    printLessThanTwo()

    println()
    printUntilStop()
}

fun addTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

// By default, "return" returns from the nearest "enclosing function" or "anonymous function".
// So, in a "nested function", this will return from the innermost function only.
fun largestNumber(a: Int, b: Int, c: Int): Int {
    fun largest(a: Int, b: Int): Int {
        if (a > b) return a
        else return b
    }

    return largest(largest(a, b), largest(b, c))
}

// If the innermost function is an "anonymous function", then that still counts for "return" purposes.
fun printLessThanTwo() {
    val list = listOf(1, 2, 3, 4)
    list.forEach(fun(x) {
        if (x < 2) println(x)
        else return
    })

    println("This line will still execute")
}

// #1
// If we need to return a value from a "closure", then we need to qualify the "return" with a label, otherwise
// the "return" would be for the "outer function". A "label" is just a string that ends with an "@":
/*fun printUntilStop() {
    val list = listOf("a", "b", "stop", "c")
    list.forEach stop@ {
        if (it == "stop") return@stop
        else println(it)
    }
}*/

// #2
// We don't need to specify the label, in which case an "implicit label" can be used.
// "Implicit labels" are the name of the function that accepted the "closure". If a "label" is defined, then the
// "implicit label" is not generated
fun printUntilStop() {
    val list = listOf("a", "b", "stop", "c")
    list.forEach {
        if (it == "stop") return@forEach
        else println(it)
    }
}