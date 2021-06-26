package data.type.classes.type.enum_class.example4

fun main() {
    println("Colors:")

    // display no params Enum
//    enumValues<Colors>().forEach {
//        println(it)
//    }

    // display with params Enum
    enumValues<Colors>().forEach {
        println("\tname:\t$it,\n\trgb:\t${it.rgb()}\n")
    }
}

// no params
//enum class Colors {
//    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
//}

// with params
enum class Colors(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);  // когда в классе перечисления
                                            // определяются какие-либо методы,
                                            // точка с запятой отделяет список
                                            // констант от определений методов

    fun rgb() = (red * 256 + green) * 256 + blue
}