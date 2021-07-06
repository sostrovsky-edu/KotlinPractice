package data.type.classes.type.object_class.companion_object.example3

fun main () {
    val persons = listOf(Person("Bob"), Person("Michael"), Person("Alice"))
    println("Sorted persons:\n${persons.sortedWith(Person)}")
}

// data class Person(val name: String) {
class Person(val name: String) {
    private val address = "Pushkin street 45"

    companion object : Comparator<Person> {
        override fun compare(person1: Person, person2: Person): Int {
            return person1.name.compareTo(person2.name)
        }

        // В книге написано, что может иметь доступ к праватному полю класса, однако это не работает...
        // fun printAddress() = println("Address: ${Person.address}")
    }
}