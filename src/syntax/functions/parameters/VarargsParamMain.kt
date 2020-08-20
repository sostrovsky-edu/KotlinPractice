package syntax.functions.parameters

// Java version
// public void println(String.. args) { }

fun main(args: Array<String>) {
    val prefixStr = "Start"
    val suffixStr = "End"

    // #1
    multiPrint("a", "b", "c")

    // #2
    multiPrint(prefixStr, "a", "b", "c")

    // #3
    multiPrint(prefixStr, "a", "b", "c", suffix = suffixStr)

    // Spread operator
    val strings = arrayOf("a", "b", "c", "d", "e")
    multiPrint(prefixStr, *strings, suffix = suffixStr)
}

// #1
//fun multiPrint(vararg strings: String): Unit {
//    for (string in strings)
//        println(string)
//}
// #2
// Functions can have regular parameters, and at most one parameter marked as "vararg":
fun multiPrint(prefix: String, vararg strings: String): Unit {
    println()
    println(prefix)
    for (string in strings)
        println(string)
}
// #3
// The "vararg" parameter is usually the last parameter, but it does not always have to be.
// If there are other parameters after "vararg", then arguments must be passed in using named parameters
fun multiPrint(prefix: String, vararg strings: String, suffix: String): Unit {
    println()
    println(prefix)
    for (string in strings)
        println(string)
    println(suffix)
}