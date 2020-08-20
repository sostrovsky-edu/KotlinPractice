package syntax.functions.type.extension_func.example4

fun main(args: Array<String>) {
    val object1 = listOf(1, 2, 3)
    val object2 = object1

    val object3 = null

    val result1 = object1.safeEquals(object2)
    val result2 = object2.safeEquals(object3)
    println("Result1: $result1 \nResult2: $result2")

    val result3 = object3.safeEquals(object2)
    println("\nResult3: $result3")
}

fun Any?.safeEquals(other: Any?): Boolean {
    if (this == null && other == null) return true
    if (this == null) return false
    return this.equals(other)
}