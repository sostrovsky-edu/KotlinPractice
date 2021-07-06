package data.type.classes.type.object_class.singleton_class.example4

fun main() {
    SingletonDerive.something()
}

// can be inherited
open class SingletonParent(var x: Int) {
    fun something() = println("x = $x")
}

object SingletonDerive: SingletonParent(10) {}