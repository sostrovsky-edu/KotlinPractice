package exceptions.example4

import java.io.BufferedReader
import java.io.StringReader

fun main() {
    // val reader = BufferedReader(StringReader("239"))             // return 239
    val reader = BufferedReader(StringReader("not а number"))    // return null

    readNumberNoFinally(reader)                                     // does nothing in cause of return

    println("2. ${readNumberWithFinally(reader)}")
}

fun readNumberWithFinally(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun readNumberNoFinally(reader : BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println("1. $number")
}