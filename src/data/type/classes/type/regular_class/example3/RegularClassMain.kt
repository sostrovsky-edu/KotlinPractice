package data.type.classes.type.regular_class.example3

fun main(args: Array<String>) {
    val person1 = Person("Jack", "Miller", 21)
    val person2 = Person("Jane", "Smith")
    val person3 = Person2("Jane", "Smith")
}

class Person (val firstName: String, val lastName: String, val age: Int?){
    init{
        require(firstName.trim().isNotEmpty()) { "Invalid firstName argument." }
        require(lastName.trim().isNotEmpty()) { "Invalid lastName argument." }

        if (age != null) {
            require(age in 0..149) { "Invalid age argument." }
        }
    }

    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
}

// Prefixing your "constructor" arguments with "val" or "var" is not a must; if you don't want the "getter"
// (or "setter" if you use "var") to be generated, you can always do the following:
class Person2(firstName: String, lastName: String, howOld:Int?) {
    private val name: String
    private val age: Int?

    init {
        this.name = "$firstName,$lastName"
        this.age = howOld
    }

    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)

    fun getName(): String = this.name
    fun getAge(): Int? = this.age
}