package data.type.classes.type.abstract_class

import java.util.*

fun main(args: Array<String>) {
    val printNumber = AlwaysOne()
    println("\nThe result number is: ${printNumber.someMethod()}")
}

open class AParent protected constructor() {
    open fun someMethod(): Int = Random().nextInt()
}

abstract class DDerived : AParent() {
    abstract override fun someMethod(): Int
}

class AlwaysOne : DDerived() {
    override fun someMethod(): Int {
        return 1
    }
}