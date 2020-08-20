package data.type.classes.operation.delegation.example1

fun main(args: Array<String>) {
    val baseImpl = BaseImpl(10)
    Derived(baseImpl).printMe() // prints 10 :: accessing the printMe() method
}

interface Base {
    fun printMe() //abstract method
}

class BaseImpl(val x: Int) : Base {
    override fun printMe() = println("\nThe value is: $x")    // implementation of the method
}

class Derived(baseImplArg: Base): Base by baseImplArg  // delegating the public method on the object baseImplArg

