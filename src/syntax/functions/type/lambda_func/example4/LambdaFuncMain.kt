package syntax.functions.type.lambda_func.example4

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    print("1.")
    list.forEach { i -> print(" $i") }

    println()
    println("2. ${list.map { i -> (i * 2) }}")
    println("3. ${list.filter { i -> (i % 2 == 0) }}")
    println("4. ${list.reduce { accumulator, i -> (accumulator + i) }}")
    println("5. ${list.sortedByDescending { it }}")
    println("6. ${list.any { it > 10 }}") // at least one element of the collection matches to the case?
    println("7. ${list.all { it < 10 }}") // all elements of the collection match to the case?
}