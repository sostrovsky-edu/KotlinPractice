package syntax.functions.type.operator_func.example3

fun main(args: Array<String>) {
    val ints = arrayOf(1,2,3,4)

    println("\n3 in ints: ${3 in ints}")
    println("ints.contains(3): ${ints.contains(3)}")
    println("5 !in ints: ${5 !in ints}")
    println("ints.contains(5): ${ints.contains(5)}")
}