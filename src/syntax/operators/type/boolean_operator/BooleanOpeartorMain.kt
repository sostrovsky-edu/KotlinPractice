package syntax.operators.type.boolean_operator

fun main(array: Array<String>) {
    var x = 1
    val y = 2
    val z = 2

//    val isTrue = x < y && x < z
//    val alsoTrue = x == y || y == z

    x = -x
    println("Operators:" +
            "\n\tnegation for (x =-x) is: $x" +
            "\n\tconjunction for ($x == 1 && $y == 1) is: ${x == 1 && y == 1}" +
            "\n\tdisjunction for ($x == 1 || $y == 1) is: ${x == 1 || y == 1}"

    )
}