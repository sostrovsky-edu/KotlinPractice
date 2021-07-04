package interfaces.example5

fun main() {
    println("1. PrivateUser name: ${PrivateUser("private_test").nickName}")
    println("2. SubscribeUser name: ${SubscribeUser("subscriber_test@gmail.com").nickName}")
    println("3. FacebookUser name: ${FacebookUser(1234567).nickName}")
    println("4. SubscribeUserExt name: ${SubscribeUserExt("subscriber_ext_test@gmail.com").nickName}")
}

// #1
// Значение свойства не хранится в интерфейсе
interface User {
    val nickName: String
}
class PrivateUser(override val nickName: String) : User
class SubscribeUser(val email: String) : User {
    override val nickName: String
        get() = email.substringBefore('@')
}
class FacebookUser(val accountId: Int) : User {
    override val nickName : String = getFacebookName(accountId)

    fun getFacebookName(accountId: Int) = "facebook_test"
}

// #2
// Значение свойства 'nickName' также не хранится в интерфейсе,
// а вычисляется из поля 'email'
interface UserExt {
    val email: String
    val nickName: String
        get() = email.substringBefore('@')
}
class SubscribeUserExt(override val email: String) : UserExt
