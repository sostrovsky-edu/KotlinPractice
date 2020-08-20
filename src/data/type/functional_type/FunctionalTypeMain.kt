package data.type.functional_type

import syntax.functions.type.extension_func.example1.buildTestUser

fun <T, R> with(receiver: T, block: T.() -> R): R =
        receiver.block()

fun main() {
    // #1
    val userBuilder = UserBuilder()
    userBuilder.setName("Test name #1")
    userBuilder.setAddress("Test address #1")
    userBuilder.setEmail("Test email #1")
    val user = userBuilder.build()

    // #1
    println("\n#1\tUser: $user")

    // #2, 3
    println("\n#2,3\tUser: ${buildTestUser()}")

    // #4
    println("\n#4\tUser: ${UserBuilder().buildTestUser()}")
}

// #2
// T.() -> R
/*fun buildTestUser(): User =
        with(UserBuilder()) {
            setName("Test name #2")
            setAddress("Test address #2")
            setEmail("Test email #2")
            build()
        }*/

// #3
fun buildTestUserOld(userBuilder: UserBuilder): User {
    userBuilder.setName("Test name #2")
    userBuilder.setAddress("Test address #2")
    userBuilder.setEmail("Test email #2")
    return userBuilder.build()
}
// (T) -> R
fun buildTestUser(): User =
        with(UserBuilder(), ::buildTestUserOld)
