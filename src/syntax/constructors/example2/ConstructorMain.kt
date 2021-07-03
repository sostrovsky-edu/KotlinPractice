
fun main() {
    val human1 = Human1()
    println("\n1. Human info: " +
            "\n\tname: ${human1.firstName}" +
            "\n\tage: ${human1.age}" +
            "\n\tmessage: ${human1.message}"
    )
}

/**
 * Если все параметры конструктора будут иметь значения по умолчанию, компилятор сгенерирует дополнительный
 * конструктор без п араметров, использующий все значения по умолчанию.
 * Это упрощает использование в Kotlin библиотек, которые создают экземпляры классов с помощью конструкторов
 * без параметров.
 */
class Human1(
        val firstName: String = "Mihail Gusev",
        var age: Int = 45,
        var message: String = "Hello Misha!"
)

/**
 * Если вообще не объявить никакого конструктора, компилятор добавит конструктор по умолчанию, которыи ничего не делает
 */
open class Human2
class Male : Human2()