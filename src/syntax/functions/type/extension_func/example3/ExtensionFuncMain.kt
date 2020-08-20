package syntax.functions.type.extension_func.example3

fun main(args: Array<String>) {
    val sub = Submarine()
    sub.fire()
    sub.submerge()
    sub.submerge(10)
}

class Submarine {
    fun fire(): Unit {
        println("\nFiring torpedoes")
    }

    fun submerge(): Unit {
        println("\nSubmerging")
    }
}

fun Submarine.fire(): Unit {
    println("\nFire on board!")
}

fun Submarine.submerge(depth: Int): Unit {
    println("\nSubmerging to a depth of $depth fathoms")
}