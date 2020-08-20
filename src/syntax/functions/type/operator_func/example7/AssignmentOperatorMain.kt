package syntax.functions.type.operator_func.example7

fun main(args: Array<String>) {
    // #1
    /*
    var counter = Counter(1)
    counter = counter + 3
    counter += 2
    println("Counter: ${counter.k}")    // 6
    */

    // #2
    var counter = Counter(1)
    counter += 2
    println("Counter: ${counter.k}")    // 3


    var a = 5
    var b = 10

    a += b
    println("\na += b | a.plusAssign(b): $a")

    a -= b
    println("a -= b | a.minusAssign(b): $a")

    a *= b
    println("a *= b | a.timesAssign(b): $a")

    a /= b
    println("a /= b | a.divAssign(b): $a")

    a %= b
    println("a %= b | a.modAssign(b): $a")
}

// #1
/*class Counter(val k: Int) {
    operator fun plus(j: Int): Counter = Counter(k + j)
}*/

// #2
class Counter(var k: Int) {
    operator fun plusAssign(j: Int): Unit {
        k += j
    }
}
