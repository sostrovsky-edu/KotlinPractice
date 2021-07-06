package data.type.classes.type.object_class.singleton_class.example1

fun main() {
    Singleton.doSomething()
    Singleton.doSomething()
}

// Singleton class
object Singleton {
    private var count = 0

    fun doSomething(): Unit {
        println("Calling doSomething (${++count} call/-s in total)")
    }
}