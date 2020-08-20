package syntax.functions.type.regular_func.example2

fun main(args: Array<String>) {
    println(myFunction("tutorialsPoint.com"))
}

fun myFunction(x: String): String {
    val c = "\nHey!! Welcome To ---"
    return (c+x)
}