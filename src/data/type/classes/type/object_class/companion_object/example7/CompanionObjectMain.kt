package data.type.classes.type.object_class.companion_object.example7

/**
 * Расширение объектов-компаньонов
 *
 * Функцию fromJSON() можно вызывать, как если бы она была определена как метод объекта-компаньона, но на самом деле
 * она определена вне его, как функция-расширение. Как всегда бывает с функциями-расширениями, она выглядит как член
 * класса, но не является им. Но учтите, что в вашем классе нужно объявить объект-компаньон, пусть даже пустой, чтобы
 * иметь возможность создать расширение для него.
 */
fun main () {
    val person = Person.fromJSON("{ name: 'Luke Besson' }")
    println("Person info:" +
            "\n\tfirstName:\t${person.firstName}" +
            "\n\tlastName:\t${person.lastName}"
    )
}

class Person(val firstName: String, val lastName: String) {
    companion object {}
}

fun Person.Companion.fromJSON(jsonText: String): Person {
    val (firstName, lastName) = jsonText.substringAfter("name:")
                                        .trim()
                                        .replace("'", "")
                                        .split(" ")
    return Person(firstName, lastName)
}