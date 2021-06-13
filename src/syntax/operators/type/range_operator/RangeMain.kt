package syntax.operators.type.range_operator

fun main(args: Array<String>) {
    // Range (as in the Python)
    println("1. ${5 in 3..10}") // true

    print("2. ")
    for (j in 1..4) {
        print(j) // prints "1234"
    }
    println()

    val i = 2
    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("3. we found your number in the position $i")
    }

    // Until
    print("4.")
    for (u in 1 until 10) {
        if (i != 1) {
            print(" ")
        }
        print("$u")
    }
    println()

    // DownTo
    print("5.")
    for (dt in 10 downTo 1) {
        print(" $dt")
    }
    println()

    // Step
    print("6.")
    for (s in 1..100 step 10) {
        print(" $s")
    }
}