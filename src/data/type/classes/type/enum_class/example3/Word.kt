package data.type.classes.type.enum_class.example3

interface Printable {
    fun print(): Unit
}

enum class Word : Printable {
    HELLO {
        override fun print() {
            println("\nWord is HELLO")
        }
    },

    BYE {
        override fun print() {
            println("\nWord is BYE")
        }
    }
}