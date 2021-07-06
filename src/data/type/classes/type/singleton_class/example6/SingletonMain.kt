package data.type.classes.type.singleton_class.example6

fun main () {
    val persons = listOf(Person("Bob"), Person("Michael"), Person("Alice"))
    println("Sorted persons:\n${persons.sortedWith(Person.NameComparator)}")
}

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(person1: Person, person2: Person): Int {
            return person1.name.compareTo(person2.name)
        }
    }
}
