package syntax.control_flow.`when`.example2

import data.type.classes.type.enum_class.example1.MaritalStatusEnum
import data.type.classes.type.enum_class.example1.SexEnum.Male as M
import data.type.classes.type.enum_class.example1.SexEnum.Female as F
import data.type.classes.type.enum_class.example1.SexEnum.NonBinary as NB

import data.type.classes.type.enum_class.example1.MaritalStatusEnum.Married
import data.type.classes.type.enum_class.example1.MaritalStatusEnum.NotMarried
import data.type.classes.type.enum_class.example1.MaritalStatusEnum.Unknown
import data.type.classes.type.enum_class.example1.SexEnum


val numArr = arrayOf(1, 2, 3)

fun main(args: Array<String>) {
    println("You can start your letter with: \n\t ${honorify(F, Married)} Smith")

    println("\nChecking value " +
            "\n\tresult1: ${checkValue(1, 5)}" +
            "\n\tresult2: ${checkValue(10)}"
    )
}

fun honorify(sex: SexEnum, maritalStatus: MaritalStatusEnum) =
        // #1
        /*when (Pair(sex, maritalStatus)) {
            Pair(Sex.Male, MaritalStatus.Married),
            Pair(Sex.Male, MaritalStatus.NotMarried),
            Pair(Sex.Male, MaritalStatus.Unknown) -> "Mr."
            Pair(Sex.Female, MaritalStatus.Married) -> "Mrs."
            Pair(Sex.Female, MaritalStatus.NotMarried) -> "Miss"
            Pair(Sex.Female, MaritalStatus.Unknown) -> "Ms."
            Pair(Sex.NonBinary, MaritalStatus.Married) -> "Mrs."
            Pair(Sex.NonBinary, MaritalStatus.NotMarried) -> "Miss"
            Pair(Sex.NonBinary, MaritalStatus.Unknown) -> "Mx."
            else -> throw IllegalArgumentException("Unknown combination of ($sex, $maritalStatus)")
        }*/

        // #2
        // simpler construction
        /*when (sex to maritalStatus) {
            Sex.Male to MaritalStatus.Married,
            Sex.Male to MaritalStatus.NotMarried,
            Sex.Male to MaritalStatus.Unknown -> "Mr."
            Sex.Female to MaritalStatus.Married -> "Mrs."
            Sex.Female to MaritalStatus.NotMarried -> "Miss"
            Sex.Female to MaritalStatus.Unknown -> "Ms."
            Sex.NonBinary to MaritalStatus.Married -> "Mrs."
            Sex.NonBinary to MaritalStatus.NotMarried -> "Miss"
            Sex.NonBinary to MaritalStatus.Unknown -> "Mx."
            else -> throw IllegalArgumentException("Unknown combination of ($sex, $maritalStatus)")
        }*/

        // #3
        // simpler construction
        /*when (sex to maritalStatus) {
            Male to Married,
            Male to NotMarried,
            Male to Unknown -> "Mr."
            Female to Married -> "Mrs."
            Female to NotMarried -> "Miss"
            Female to Unknown -> "Ms."
            NonBinary to Married -> "Mrs."
            NonBinary to NotMarried -> "Miss"
            NonBinary to Unknown -> "Mx."
            else -> throw IllegalArgumentException("Unknown combination of ($sex, $maritalStatus)")
        }*/

        // #4
        // simpler construction
        when (sex to maritalStatus) {
            M to Married,
            M to NotMarried,
            M to Unknown -> "Mr."
            F to Married -> "Mrs."
            F to NotMarried -> "Miss"
            F to Unknown -> "Ms."
            NB to Married -> "Mrs."
            NB to NotMarried -> "Miss"
            NB to Unknown -> "Mx."
            else -> throw IllegalArgumentException("Unknown combination of ($sex, $maritalStatus)")
        }


fun checkValue(a: Int, b: Int): String =
        when (a) {
            b -> "a == b"
            is Int -> "a is of type Int"                    // instanceOf
            is Int? -> "a is of type Int?"                  // instanceOf
            !is Int? -> "a is not of type Int?"             // instanceOf
            in numArr -> "numArr contains $a"               // contains
            !in numArr -> "numArr doesn't contain $a"       // contains
            else -> ""
        }

fun checkValue(a: Int): Boolean =
        when {
            a > 5 -> true
            a is Int -> true        // instanceOf
            a is Int? -> true       // instanceOf
            a !is Int? -> true      // instanceOf
            a in numArr -> true     // contains
            a !in numArr -> false   // contains
            else -> false
        }