package data.type.classes.type.nested_class.example1

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // calling nested class method
    print(demo)
}

class Outer {
    class Nested {
        fun foo() = "\nWelcome to The TutorialsPoint.com\n"
    }
}