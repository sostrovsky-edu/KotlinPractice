package data.type.classes.type.sealed_class.example1

import data.type.classes.type.sealed_class.example2.HttpCodeExtended

fun main(args: Array<String>) {
    val obj: MyExample = MyExample.OP2()

    val output = when (obj) { // defining the object of the class depending on the inputs
        is MyExample.OP1 -> "Option One has been chosen"
        is MyExample.OP2 -> "Option Two has been chosen"
    }

    println(output)

}

sealed class MyExample {
    class OP1 : MyExample() // MyExample class can be of two types only
    class OP2 : MyExample()
}

fun httpCodeExToHttpMessage(code: HttpCodeExtended): String =
        when (code) {
            is HttpCodeExtended.OK -> "OK"
            is HttpCodeExtended.BAD_REQUEST -> "BAD REQUEST"
            is HttpCodeExtended.FORBIDDEN -> "FORBIDDEN"
            is HttpCodeExtended.I_AM_A_TEAPOT -> "I_AM_A_TEAPOT"
            is HttpCodeExtended.INTERNAL_SERVER_ERROR -> "INTERNAL_SERVER_ERROR"
            // else -> "Unknown code"
        }

fun getSomeHotHttpWater(code: HttpCodeExtended): Unit =
        when(code) {
            is HttpCodeExtended.I_AM_A_TEAPOT -> code.boilMeSomeWater()
            else -> Unit
        }