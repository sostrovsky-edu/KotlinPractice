package interfaces.example1

fun main(args: Array<String>) {
    val humanImpl = HumanImplementation()
    println("\nHumanImpl age= ${humanImpl.age}")

    println("\nMessage (man): ")
    humanImpl.manHello()

    println("\nMessage (woman): ")
    humanImpl.womanHello()

    println("\nGreeting:")
    humanImpl.hello()
}

interface Human {
    var age: Int    // abstract property
    fun hello()     // abstract method
}

interface MaleInterface: Human {
    fun manHello() {
        println("\tHello, I am a man!")
    }
}

interface FemaleInterface: Human {
    fun womanHello() {
        println("\tHello, I am a woman!")
    }
}

class HumanImplementation: Human, MaleInterface, FemaleInterface {
    override var age = 25
    override fun hello() = println("\tHappy Learning ")
}