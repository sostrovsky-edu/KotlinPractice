package data.type.numbers

fun main(array: Array<String>) {
    printNumbers()
    checkNumbers()
}

fun printNumbers() {
    val int = 123
    val long = 123456L
    val double = 12.34
    val float = 12.34F
    val hexadecimal = 0xAB
    val binary = 0b01010101

    val intToLong = int.toLong()
    val floatToDouble = float.toDouble()

    /**
     * toByte()
     * toShort()
     * toInt()
     * toLong()
     * toFloat()
     * toDouble()
     * toChar()
     */
    println("Numbers: " +
            "\n\tint: $int" +
            "\n\tlong: $long" +
            "\n\tdouble: $double" +
            "\n\tfloat: $float" +
            "\n\thexadecimal: $hexadecimal" +
            "\n\tbinary: $binary" +
            "\n\tint to long converted (toLong): $intToLong" +
            "\n\tfloat to double converted (toDouble): $floatToDouble"
    );
}

fun checkNumbers() {
    val a1: Int? = 127
    val b1: Int? = 127

    val a2: Int? = 128
    val b2: Int? = 128

    /**
     * a == b <-> a?.equals(b) ?: (b == null)
       Если "a" будет равна "null", то выражение превратиться в:
            a?.equals(b) ?: (b == null)
     */
    println("\nChecking structure equality of " +
            "\n\t$a1 and $b1 result: ${a1 == b1}")      // true

    println("\nChecking reference equality of " +
            "\n\t$a2 and $b2 result: ${a2 === b2}")     // false
}