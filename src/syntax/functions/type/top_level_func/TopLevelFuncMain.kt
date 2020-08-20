package syntax.functions.type.top_level_func

fun main(args: Array<String>) {

    // foo(1)   // - Exception
    // foo(10)  // - Exception
    foo(100) // - Good
}

fun foo(k: Int) {
    println()
    require(k > 10, { "k should be greater than 10" })
    println("k is good")
}