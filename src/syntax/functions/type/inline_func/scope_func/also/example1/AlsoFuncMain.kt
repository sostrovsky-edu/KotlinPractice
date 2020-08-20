package syntax.functions.type.inline_func.scope_func.also.example1

import data.type.functional_type.User
import data.type.functional_type.UserBuilder


fun main() {
    val userById = getUserById("")?.also {
        it.setName("Test name")
        it.setAddress("Test address")
        it.setEmail("Test email")
    }

    println("\nUser with no id: ${userById?.build()}")
}

fun getUserById(id: String): UserBuilder? {
    return if (id.isEmpty()) return null
    else UserBuilder().apply {
        setName("Test name")
        setAddress("Test address")
        setEmail("Test email")
    }
}

fun getUser(): User {
    val userBuilder = UserBuilder().also {
        it.setName("Test name")
        it.setAddress("Test address")
        it.setEmail("Test email")
    }
    return userBuilder.build()
}