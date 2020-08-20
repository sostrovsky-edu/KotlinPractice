package syntax.functions.type.inline_func.scope_func.also.example2

/**
 * Use the "also()" function, if your block does not access its "receiver" parameter at all, or if it does not
 * mutate its "receiver" parameter.
 * Don’t use "also()" if your block needs to return a different value.
 */
fun main() {
    val person: Person = getPerson().also {
        print(it.name)
        print(it.age)
    }

    println("\nPerson: $person")
}

fun getPerson(): Person {
    val person = Person()
    person.name = "Test User"
    person.age = 18
    return person
}

class Person {
    var name: String? = null
    var age: Int? = null

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}