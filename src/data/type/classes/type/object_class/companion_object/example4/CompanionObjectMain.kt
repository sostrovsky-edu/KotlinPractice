package data.type.classes.type.object_class.companion_object.example4

/**
 * Замена вторичных конструкторов на companion-object с фабричными методами.
 */
fun main() {
    // #1
    val user1 = User_1("test_user_1@mail.ru")
    println("1. User: ${user1.nickName}")

    val user2 = User_1(1726354)
    println("2. User: ${user2.nickName}")

    val user3 = User_2.newSubscribingUser("test_user_3@mail.ru")
    println("3. User: ${user3.nickName}")
}

// #1
class User_1 {
    var nickName: String

    constructor(email: String) {
        nickName = email.substringBefore("@")
    }

    constructor(accountId: Int) {
        nickName = getAccountById(accountId)
    }
}

// #2
class User_2 private constructor(val nickName: String) {
    companion object {
        fun newSubscribingUser(email: String) = User_2(email.substringBefore("@"))
        fun newFacebookUser(accountId: Int) = User_2(getAccountById(accountId))
    }
}

fun getAccountById(accountId: Int) = "Test-$accountId"