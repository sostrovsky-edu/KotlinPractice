package data.type.classes.type.object_class.anonymous_class.example1

fun main() {
    val programmer: Human = object : Human {
        override fun think() {
            print("\nI am an example of Anonymous Inner Class\n")
        }
    }
    programmer.think()
}

interface Human {
    fun think()
}