package data.type.classes.type.singleton_class.example1

// Singleton class
object Singleton {
    private var count = 0

    fun doSomething(): Unit {
        println("Calling doSomething (${++count} call/-s in total)")
    }
}