package syntax.operators.type.equals_operator

fun main(args: Array<String>) {
    val a1: Int? = 127
    val b1: Int? = 127
    println(a1 === b1)    // true

    val a2: Int? = 128
    val b2: Int? = 128
    println(a2 === b2)    // false
}