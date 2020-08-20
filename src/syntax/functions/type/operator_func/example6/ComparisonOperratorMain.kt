package syntax.functions.type.operator_func.example6

fun main(args: Array<String>) {
    val a = BingoNumber("Key to the Door", 21)
    val b = BingoNumber("Jump and Jive", 35)
    println("a < b: ${a < b}") // true
    println("b < a: ${b < a}") // false
}

class BingoNumber(val name: String, val age: Int) {
    operator fun compareTo(other: BingoNumber): Int {
        return when {
            age < other.age -> -1
            age > other.age -> 1
            else -> 0
        }
    }
}