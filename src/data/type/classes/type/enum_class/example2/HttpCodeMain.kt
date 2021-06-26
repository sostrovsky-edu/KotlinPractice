package data.type.classes.type.enum_class.example2

import syntax.functions.type.infix_func.example2.HttpCode

fun main(args: Array<String>) {
    println("Here are HTTP codes")
    println("From Bad request to I'm a teapot:")
    enumValues<HttpCode>().forEach {
        println("\tname: $it,\n\tcode: ${it.code}\n")
    }
}

// #1
// fun httpCodeToHttpMessage(code: HttpCode): String = code.name

// #2
fun httpCodeToHttpMessage(code: HttpCode): String =
        when (code) {
            HttpCode.OK -> "OK"
            HttpCode.BAD_REQUEST -> "Bad request"
            else -> "Unknown code"
        }

fun httpCodeToInternalCode(code: HttpCode): Int = code.ordinal

fun internalCodeToHttpCode(code: Int): HttpCode = HttpCode.values()[code]


fun httpMessageToHttpCode(msg: String): HttpCode = HttpCode.valueOf(msg)    // IllegalArgumentException

