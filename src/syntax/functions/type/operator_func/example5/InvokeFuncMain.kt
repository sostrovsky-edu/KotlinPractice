package syntax.functions.type.operator_func.example5

import Utils.printCollection
import kotlin.random.Random

fun main(args: Array<String>) {
    fun newSeed(): Long = 123456L // some secure seed
    val random = RandomLongs(newSeed())
    val longs = listOf(random(), random(), random())
    printCollection(longs, "Longs")

    println("\nMin(1, 2, 3): ${Min(1, 2, 3)}")
    println("Min(1L, 2L): ${Min(1L, 2L)}")
}

class RandomLongs(seed: Long) {
    private val random = Random(seed)
    operator fun invoke(): Long = random.nextLong()
}

object Min {
    operator fun invoke(a: Int, b: Int): Int = if (a <= b) a else b

    operator fun invoke(a: Int, b: Int, c: Int): Int = invoke(invoke(a,	b), c)

    operator fun invoke(a: Int, b: Int, c: Int, d: Int): Int = invoke(invoke(a, b), invoke(c, d))

    operator fun invoke(a: Long, b: Long): Long = if (a <= b) a else b

    operator fun invoke(a: Long, b: Long, c: Long): Long = invoke(invoke(a, b), c)

    operator fun invoke(a: Long, b: Long, c: Long, d: Long): Long = invoke(invoke(a, b), invoke(c, d))
}