package data.type.classes.type.sealed_class.example1

fun main() {
    val obj: MyExample = MyExample.OP2()

    val output = when (obj) { // defining the object of the class depending on the inputs
        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "Option Two has been chosen"
    }

    println(output)
}

sealed class MyExample {
    class OP1 : MyExample() // MyExample class can be of two types only
    class OP2 : MyExample()
}