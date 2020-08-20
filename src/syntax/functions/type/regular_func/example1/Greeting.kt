package syntax.functions.type.regular_func.example1

import data.type.classes.type.enum_class.example1.MaritalStatusEnum
import data.type.classes.type.enum_class.example1.SexEnum
import syntax.operators.type.when_operator.honorify

fun buildGreeting(info: Array<String>):String {
    val firstName = getFirstName(info) ?: "John"
    val lastName = getLastName(info) ?: "Doe"
    val maritalStatus = getMaritalStatus(info) ?: MaritalStatusEnum.Unknown
    val sex = guessSex(info) ?: SexEnum.NonBinary

    return ("Hello, ${honorify(sex, maritalStatus)} " +
            "${shorten(firstName)} $lastName")
}