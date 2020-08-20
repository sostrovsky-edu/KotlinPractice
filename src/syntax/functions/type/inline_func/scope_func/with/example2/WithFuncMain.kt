package syntax.functions.type.inline_func.scope_func.with.example2

fun main() {
    println("\nAlphabet (regular call): ${alphabetRegular()}")
    println("\nAlphabet (\"with{}\" call): ${alphabetWith()}")
}

fun alphabetRegular(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

// #1
/*fun alphabetWith(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
}*/
// #2
fun alphabetWith(): String = with(StringBuilder()) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
}