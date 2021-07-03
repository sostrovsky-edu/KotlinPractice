package syntax.constructors.example1

fun main() {
    val human1 = Human1()
    human1.firstName = "Gavrila Hlebnikov"
    human1.age = 27
    println("\n1. Human1 info: " +
            "\n\tname: ${human1.firstName}" +
            "\n\tage: ${human1.age}"
    )

    val human2 = Human2("Ivan Petrov", 25)
    println("\n2. Human info: " +
            "\n\tname: ${human2.firstName}" +
            "\n\tage: ${human2.age}" +
            "\n\tmessage: ${human2.message}"
    )

    val human3 = Human2()
    println("\n3. Human info: " +
            "\n\tname: ${human3.firstName}" +
            "\n\tage: ${human3.age}" +
            "\n\tmessage: ${human3.message}"
    )
}

// primary constructor with annotation
// class Human @ShouldNotBeOptimized constructor(val firstName: String, var age: Int) {

// primary constructor
class Human1 {
    var firstName: String = "No name"
    var age: Int? = null

    // initialization block
    init {
        age = calculateAge()
    }

    private fun calculateAge() = 0
}

// #1
/* class Human2(firstName: String, var age: Int) {
    val firstName = firstName
*/

// #2
class Human2(val firstName: String, var age: Int) {
    val message = "Hi!"

    // secondary constructor
    constructor(name: String, age: Int, msg:String): this(name, age)
    constructor(): this("No name", 0)
}
