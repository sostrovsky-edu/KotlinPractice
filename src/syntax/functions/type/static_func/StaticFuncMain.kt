package syntax.functions.type.static_func

fun main(args: Array<String>) {
    val str = "Hello"
    println("\nThe first letter of the string \"$str\" is: ${showFirstCharacter(str)}")
}


/** Unlike Java, Kotlin doesn't support "static methods" for a class, which do not belong to the object instance,
 *  but rather to the type itself.
 *  In Kotlin, it is advisable to define methods at the package level to achieve the functionality of "static methods".
 *  Will return the first character of the input string (if the input is empty, an exception will be raised)
 *  The compiler will generate a class for us and has marked it as "final"; it can't be inherited, as you already know.
 *  Within this class, the compiler will add the function we defined. In ".class" file the call will be made via the
 *  "invokestatic" routine.
 */
fun showFirstCharacter(input:String): Char {
    if (input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}