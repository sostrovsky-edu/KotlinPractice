package syntax.functions.type.inline_func.scope_func.apply.example1

import data.type.functional_type.User
import data.type.functional_type.UserBuilder

fun main() {
    // #1
    println("\nUser: ${getUser()}")

    /*val userById = getUserById("").apply {
        UserBuilder?.setName("Test name")
        UserBuilder?.setAddress("Test address")
        UserBuilder?.setEmail("Test email")
    }*/

    // #2
    val userById1 = getUserById("")?.build()
    println("\nUser by Id = null: $userById1")

    val userById2 = getUserById("1")?.build()
    println("\nUser by Id = 1: $userById2")
}

fun getUser(): User = UserBuilder().apply {
        setName("Test name")
        setAddress("Test address")
        setEmail("Test email")
    }.build()

fun getUserById(id: String): UserBuilder? {
    return if (id.isEmpty()) return null
    else UserBuilder().apply {
        setName("Test name")
        setAddress("Test address")
        setEmail("Test email")
    }
}