package syntax.functions.return_type.example1

// We can improve the #4 approach by using "destructuring declarations" on the caller site.
// "Destructuring declarations" allow the values to be extracted into separate variables automatically:
fun main(args: Array<String>) {
    val (pos, neg) = roots3(16)
    println("The values are: " +
            "\n\tpositive: $pos" +
            "\n\tnegative: $neg"
    )
}

// #1
// Let's say we wanted to calculate both the positive and negative square roots of an integer.
// We could approach this problem by writing two different functions.
fun positiveRoot(k: Int): Double {
    require(k >= 0)
    return Math.sqrt(k.toDouble())
}
fun negativeRoot(k: Int): Double {
    require(k >= 0)
    return -Math.sqrt(k.toDouble())
}

// #2
// Another approach might be to return an array so we only have to invoke one function.
fun roots(k: Int): Array<Double> {
    require(k >= 0)
    val root = Math.sqrt(k.toDouble())

    return arrayOf(root, -root)
}

// #3
// However, we do not know from the return type whether the positive root or negative root is at position 0.
// We will have to hope the documentation is correct; if not, inspect the source code.
// We could improve this further by using a class with two properties that wrap the return values.
class Roots(pos: Double, neg: Double)
fun roots2(k: Int): Roots {
    require(k >= 0)
    val root = Math.sqrt(k.toDouble())

    return Roots(root, -root)
}

// #4
// This has the advantage of having named fields so we could be sure which is the:
//      * positive root
//          and
//      * negative root.
// An alternative to a custom class is using the Kotlin standard library "Pair" type.
// This type simply wraps two values, which are accessed via the first and second fields.
fun roots3(k: Int): Pair<Double, Double> {
    require(k >= 0)
    val root = Math.sqrt(k.toDouble())

    return Pair(root, -root)
}


