package data.operations.type_cast.example2

/*
Java casting:
    public void printStringLength(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj
                    System.out.print(str.length())
        }
    }
*/

fun main(args: Array<String>) {
    val str = "Abcd"
    printStringLength(str)
    println("String is empty: ${isEmptyString(str)}")
    println("This is not a string or it is empty: ${isNotStringOrEmpty(str)}")
}

fun printStringLength(any: Any) {
    if (any is String) {
        println("\nThe length of the \"$any\" is = ${any.length}")
    }
}

fun isEmptyString(any: Any): Boolean {
    return any is String && any.length == 0
}

fun isNotStringOrEmpty(any: Any): Boolean {
    return any !is String || any.length == 0
}