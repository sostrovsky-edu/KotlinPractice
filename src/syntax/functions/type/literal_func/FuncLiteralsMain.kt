package syntax.functions.type.literal_func

fun main(args: Array<String>) {
    val printHello = { println("hello") }
    printHello()

    // #1
    val printMessage = { message: String -> println(message) }
    // #2
    // val printMessage = { message -> println(message) }
    // #3
    // val printMessage = { println(it) }
    printMessage("hello")
    printMessage("world")
}