package data.operations.type_cast.example2

fun main(args: Array<String>) {
    val str = "Abcd"
    val nullStr = null
    println("\nThe length of the string \"$str\" is: ${length(str)}")
    println("\nThe length of the null string is: ${length(nullStr)}")
}

// #1
/*
fun length(any: Any): Int {
    val string = any as String
    return string.length
}*/

// #2
// Throws "TypeCastException" if the value is null
/*
fun length(any: Any?): Int {
    val string: String? = any as String
    return string!!.length
}*/

// #3
// Returns null as a result of the calculation of the length when the value is null
fun length(any: Any?): Int? {
    val string: String? = any as? String
    return string?.length
}