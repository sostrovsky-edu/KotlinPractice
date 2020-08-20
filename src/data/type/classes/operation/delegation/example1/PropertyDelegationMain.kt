package data.type.classes.operation.delegation.example1

fun main(args: Array<String>) {
    println(myVar +" My dear friend")
}

val myVar: String by lazy {
    "\nHello"
}
