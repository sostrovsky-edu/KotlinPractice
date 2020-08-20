package syntax.functions.type.recursive_func

fun main(args: Array<String>) {
    val value = 5
    println("\nFibonacci sequence of \"$value\" is: ${fib(value)}")

    println("\nFactorial of \"$value\" is: ${fact(value)}")
}

fun fib(k: Int): Int = when (k) {
    0 -> 1
    1 -> 1
    else -> fib(k - 1) + fib(k - 2)
}

// #1
/*fun fact(k: Int): Int {
    return if (k == 0) 1
    else k * fact(k - 1)
}*/
// #2
/*fun fact(k: Int): Int {
    fun factTail(m: Int, n: Int): Int {
        return if (m == 0) n
        else factTail(m - 1, m * n)
    }

    return factTail(k, 1)
}*/
// #3
fun fact(k: Int): Int {
    tailrec fun factTail(m: Int, n: Int): Int {
        return if (m == 0) n
        else factTail(m - 1, m * n)
    }

    return factTail(k, 1)
}