package exercises

fun main() {
    val string = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB" // -> A4B3C2XYD4E3F3A6B28

    print("1. ${countLetters_MySolution(string)}")
    print("\n2. ${countLetters(string)}")
}

fun countLetters_MySolution(string_To_Handle: String): String {
    val result = StringBuilder()

    var repeat = 1
    for (i in string_To_Handle.indices) {
        val curLetter = string_To_Handle[i].toString()

        val hasNextLetter = (i < string_To_Handle.length-1)
        val nextLetter: String = if (hasNextLetter) {
            string_To_Handle[i+1].toString()
        } else {
            ""
        }

        if (hasNextLetter && (curLetter == nextLetter)) {
            repeat++
        } else {
            result.append(curLetter)

            if (repeat > 1) {
                result.append("$repeat")
                repeat = 1
            }
        }
    }

    return result.toString()
}

fun countLetters(string: String): String {
    var currentLetter = string[0]
    var count = 1
    var result = ""

    for (letter in string.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1) {
                result += currentLetter
            } else {
                result += "$currentLetter$count"
            }

            count = 1
            currentLetter = letter
        }
    }

    // Последние буквы в строке
    if (count == 1) {
        result += currentLetter
    } else {
        result += "$currentLetter$count"
    }

    return result
}