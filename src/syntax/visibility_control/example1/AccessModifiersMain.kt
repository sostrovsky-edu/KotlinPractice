package syntax.visibility_control.example1

// private
private class privateExample {
    private val i = 1
    private fun doSomething() {
    }
}

// protected
open class A() {
    protected val i = 1
}
class B : A() {
    fun getValue() : Int {
        return i
    }
}

// internal
class internalExample {
    internal val i = 1
    internal fun doSomething() {
    }
}

// public
class publicExample {
    val i = 1
    fun doSomething() {
    }
}