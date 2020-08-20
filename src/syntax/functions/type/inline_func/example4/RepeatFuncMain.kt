package syntax.functions.type.inline_func.example4

fun main() {
    repeat(10) { println("Hello") }

    println()
    println('a' * 3)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}