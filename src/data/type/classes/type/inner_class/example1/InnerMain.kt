package data.type.classes.type.inner_class.example1

fun main() {
    val demo = Outer().Inner().foo()
    print(demo)
}

class Outer {
    private val welcomeMessage: String = "\nWelcome to the TutorialsPoint.com\n"
    inner class Inner {
        fun foo() = welcomeMessage
    }
}