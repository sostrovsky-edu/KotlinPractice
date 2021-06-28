package syntax.properties.top_level_property.example2

import java.lang.StringBuilder

fun main() {
    val str = "Kotlin"
    println("1. \"$str\" last char is: ${str.lastChar}")

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println("2. Changed string builder value is: $sb")
}