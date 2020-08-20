package syntax.control_flow.loop.for_loop.example2

fun main(args: Array<String>) {
    val items = listOf(1, 22, 83, 4)

    println("\nInteger array:")
    for (i in items) println("item: $i")

    // #1
    println("\n#1_Integer array(withIndex):")
    for ((index, value) in items.withIndex()) {
        println("item[$index]: $value")
    }

    // #2
    println("\n#2_Integer array(indices):")
    for (index in items.indices) {
        println("item[$index]: ${items[index]}")
    }

    // #3
    println("\n#3_Integer array(lastIndex):")
    for (index in 0..items.lastIndex) {
        println("item[$index]: ${items[index]}")
    }

    // #4
    println("\n#4_Integer array(until):")
    for (index in 0 until items.size) {
        println("item[$index]: ${items[index]}")
    }

    println("\nChar array:")
    val string = "print my characters"
    for (char in string) {
        println(char)
    }

    println("\nInteger values:")
    val oneToThree = 1..3
    for (k in oneToThree) {
        for (j in 1..2) {
            println(k * j)
        }
    }
}