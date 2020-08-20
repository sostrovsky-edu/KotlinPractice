package data.type.classes.type.singleton_class.example4

// can be inherited
open class SingletonParent(var x:Int) {
    fun something() = println("x= $x")
}

object SingletonDerive: SingletonParent(10) {}