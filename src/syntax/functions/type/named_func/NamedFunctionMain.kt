package syntax.functions.type.named_func

fun main() {
    var a = 1
    var b = 2
    var c = 0x00001111

    val leftShift = a shl b
    val rightShift = a shr b
    val unsignedRightShift = a ushr b
    val and = a and c
    val or = a or c
    val xor = a xor c
    val inv = a.inv()

    println("\nNamed functions:" +
            "\n\tleftShift: $leftShift" +
            "\n\trightShift: $rightShift" +
            "\n\tunsignedRightShift: $unsignedRightShift" +
            "\n\tand: $and" +
            "\n\tor: $or" +
            "\n\txor: $xor" +
            "\n\tinv: $inv"
    )
}