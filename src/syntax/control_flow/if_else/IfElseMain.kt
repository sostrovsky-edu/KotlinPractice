package syntax.control_flow.if_else

fun main(args: Array<String>) {
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    print("Max value is: $max")

    // As expression
    // val max = if (a > b) a else b
}