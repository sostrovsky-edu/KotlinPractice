package data.type.classes.type.object_class.companion_object.example1

fun main() {
    println("Heyyy!!! "+ A.show())
}

class A {
    companion object {
        fun show(): String {
            return "You are learning Kotlin from TutorialsPoint.com"
        }
    }
}