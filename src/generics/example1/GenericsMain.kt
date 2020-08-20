package generics.example1

fun main(args: Array<String>) {
    println("\nObject#1: ")
    genericsExample<String>("JAVA")

    println("\nObject#2: ")
    genericsExample<Int>(10)
}

// #1
// class genericsExample<T>(input:T) {

// #2
class genericsExample<out T>(input:T) {
    init {
        println("\tI am getting called with the value "+input)
    }
}