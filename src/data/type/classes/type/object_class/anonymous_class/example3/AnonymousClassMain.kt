package data.type.classes.type.object_class.anonymous_class.example3

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/**
 * Ключевое слово object можно использовать не только для объявления именованных объектов-одиночек, но и для создания
 * анонимных объектов. Они заменяют анонимные внутренние классы в Java.
 *
 * Это пример использования анонимных внутренних классов в Java - реализация обработчика событий - на языке Kotlin.
 *
 * Синтаксис ничем не отличается от объявления объекта, за исключением указания его имени (здесь оно отсутствует).
 * Объект-выражение объявляет класс и создает экземпляр этого класса, но не присваивает имени ни классу, ни экземпляру.
 * Как правило, в этом нет необходимости, поскольку объект используется в качестве параметра вызова функции.
 *
 * В отличие от анонимных внутренних классов Java, которые могут наследовать только один класс или реализовать только
 * один интерфейс, анонимный объект Kotlin может реализовывать несколько интерфейсов или вовсе ни одного.
 *
 * В отличие от объявления объекта, анонимные объекты - не <<одиночки>>. При каждом выполнении объекта-выражения
 * создается новый экземпляр объекта.
 *
 * Объекты-выражения полезны, когда в анонимном объекте нужно переопределить несколько методов.
 */

// Anonymous inner class where we count the number of clicks on a button
class Controller {
    private var clicks: Int = 0

    fun enableHook() {
        /*button.addMouseListener(object : MouseAdapter() {
            override fun mouseClicked(e: MouseEvent) { clicks++ }
        })

        window.addMouseListener(
           // Объявпение анонимного объекта, наследующего MouseAdapter
           object : MouseAdapter() {
               // Переопределение методов MouseAdapter

               override fun mouseClicked(e: MouseEvent) {
                   // ...
               }
               override fun mouseEntered(e: MouseEvent) {
                   // ...
               }
           }
        )*/
    }

    // Как анонимные классы в Java, код в объекте-выражении может обращаться к переменным в функциях, где он был
    // создан. Но, в отличие от Java, это не ограничено переменными с модификатором final ; объект-выражение может
    // также изменять значения переменных. Вот как с помощью обработчика событий подсчитать количество щелчков
    // мышью в окне.
    /*fun countClick(window: Window) {
        // Объявление локальной переменной
        var clickCount = 0

        window.addMouseListener(
            object : MouseAdapter() {
                override fun mouseClicked(e: MouseEvent) {
                    // Изменение значения переменной
                    clickCount++
                }
            }
        )
    }*/

    // Если объекту потребуется дать имя, его можно сохранить в переменной
    val listener = object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) { }
        override fun mouseEntered(e: MouseEvent) { }
    }
}