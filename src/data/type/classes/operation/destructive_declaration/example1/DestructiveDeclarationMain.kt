package data.type.classes.operation.destructive_declaration.example1

import data.type.classes.type.data_class.example3.SignUpMsg

// Good
fun processSignUpMsg(msg: SignUpMsg) {
    val(id, pwd, email) = msg
}

// Bad - does not work yet
/*
fun processSignUpMsg(msg: SignUpMsg) {
    val(id, pwd, (host, domain)) = msg
}
*/

// Good
fun printChars() {
    val charMap = mapOf(1 to "A", 2 to "B")
    for ((k, v) in charMap) {
        println("Key: $k, value: $v")
    }
}

// #1
/*
fun fixSignUpMsg(msg: SignUpMsg): SignUpMsg {
    val(_, password) = msg
    // val(_, password, _, _, address) = msg
    val pwdHash = computePwdHash(password)
    return SignUpMsg(msg.denizenId, pwdHash, msg.email)
} */

// #2
fun fixSignUpMsg(msg: SignUpMsg): SignUpMsg = msg.copy(password = computePwdHash(msg.password))

fun computePwdHash(password: String): String {
    TODO("Not yet implemented")
}
