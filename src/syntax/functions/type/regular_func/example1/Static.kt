package syntax.functions.type.regular_func.example1

// static functions
fun showFirstCharacter(input:String):Char {
    if (input.isEmpty()) throw IllegalArgumentException()
    return input.first()
}