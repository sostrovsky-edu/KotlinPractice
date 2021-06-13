package data.type.classes.type.regular_class.example4

fun main() {
    val person_1 = Person_USA("Tom", "Anderson", 45)
    print(person_1)

    val child_1 = Person_USA("Bob", "Taylor", 1)
    val person_2 = Person_USA("Joanna", "Taylor", 33, child_1)
    print("\n$person_2")

    val person_3 = Person_USA()
    print("\n$person_3")
}

// Primary constructor
class Person_USA(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person_USA> = mutableListOf() // ArrayList

    // Will be executed after primary constructor
    init {
        print("\nPerson with name $firstName is created.")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person_USA):
            this(firstName, lastName, age) {
        children.add(child)
    }

    constructor(): this("No_Name", "No_LastName", 0)

    override fun toString(): String {
        return "Person" +
                "\n(" +
                "\n\tfirstName='$firstName'," +
                "\n\tlastName='$lastName'," +
                "\n\tage=$age," +
                "\n\tchildren=$children" +
                "\n)"
    }
}













