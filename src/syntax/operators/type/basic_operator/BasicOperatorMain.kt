package syntax.operators.type.basic_operator

fun main(args: Array<String>) {

    val a = 5
    val b = 10
    val c = true

    println("\nBasic operators are:" +
            "\n\ta + b | a.plus(b): ${a.plus(b)}" +
            "\n\ta - b | a.minus(b): ${a.minus(b)}" +
            "\n\ta * b | a.times(b): ${a.times(b)}" +
            "\n\ta / b | a.div(b): ${a.div(b)}" +
            // "\n\ta & b | a.mod(b): ${a.mod(b)}" +
            "\n\ta .. b | a.rangeTo(b): ${a.rangeTo(b)}" +
            "\n\t+a | a.unaryPlus(): ${a.unaryPlus()}" +
            "\n\t-a | a.unaryMinus(): ${a.unaryMinus()}" +
            "\n\t!c | c.not(): ${c.not()}"
    )
}

