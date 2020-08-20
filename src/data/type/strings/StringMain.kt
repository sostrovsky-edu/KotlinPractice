package data.type.strings

fun main(array: Array<String>) {
    val regularString = "\n\tThis \"string\" \be funky"
    println("\nRegular string $regularString")

    val rawString = """
        This is a raw "string"
        it \should be printed as-is"""
    println("\nRaw string $rawString")

    // string interpolation example
    val dollarString = """
        ${'$'}tring templates shall not pass!"""
    println("\nDollar string $dollarString")

    val escapedString : String  = "I am an escaped String!\n"
    println("\nHello! "+escapedString)
}