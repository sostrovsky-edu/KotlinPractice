package syntax.functions.type.inline_func.example4

fun main() {
    neverEmpty("Test String")
    neverEmpty("")
}

fun neverEmpty(str: String) {
    require(str.isNotEmpty()) { "String should not be empty" }
    println(str)
}