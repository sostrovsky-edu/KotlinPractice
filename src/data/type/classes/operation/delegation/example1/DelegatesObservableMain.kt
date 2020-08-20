package data.type.classes.operation.delegation.example1

import kotlin.properties.Delegates

fun main(args: Array<String>) {
    val user = User()
    user.name = "first"
    user.name = "second"
}

class User {
    var name: String by Delegates.observable("\nWelcome to Tutorialspoint.com") {
        prop, old, new ->
        println("$old -> $new")
    }
}
