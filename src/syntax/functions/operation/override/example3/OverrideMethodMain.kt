package syntax.functions.operation.override.example3

fun main() {
    val circle = Circle()
    // val square = Square() // Can't create an instance of an abstract class
}

/**
 * Одно из основных преимуществ классов, закрытых по умолчанию:
 *  они позволяют выполнять автоматическое приведение типов в большем количестве сценариев.
 * Автоматическое приведение возможно только для переменных, которые нельзя изменить после
 * проверки типа. Для класса это означает, что автоматическое приведение типа может применяться
 * только к неизменяемым своиствам с модификатором val со стандартным методом доступа.
 * Из этого следует, что свойство должно быть final иначе подкласс сможет переопределить свойство
 * и определить собственный метод доступа, нарушая основное требование автоматического приведения типов.
 * Поскольку по умолчанию свойства получают модификатор final, автоматическое приведение работает с
 * большинством свойств в вашем коде, что повышает его выразительность.
 */
final class Circle()

/**
 * Абстрактные методы всегда открыты, поэтому не требуется явно использовать модификатор "open".
 */
abstract class Square()

// abstract class Shape : Circle() { // This type is final, so it can not be inherited from
abstract class Shape : Square() {
    abstract var width: Double
    abstract var height: Double

    // Это закрытая функция: ее невозможно переопределить в подкпассе
    // по-умолчанию final
    fun area() = (width * height)

    // Это открытая функция: ее можно переопределить в подклассе
    open fun rotate() {}
}

open class RectangleWithRoundCorners : Shape() {
    var cornerRadius: Double = 0.0
        get() = 0.5
        set(value) { field = value}
    override var width: Double
        get() = 1.0
        set(value) {}
    override var height: Double
        get() = 3.0
        set(value) {}

    /**
     * Допустим есть вероятность что будет объявлен такой наследник
     * класса Shape и по-своему реализует вычисление площади.
     * Чтобы это запретить, в классе Shape метод area() не должен позволять
     * себя переопределять (override) т.е. быть final.
     */
    // override fun area(): Double = ((width * height) - (4 * cornerRadius))

    /**
     * Переопредепение открытой функции также является открытым
     * (ничего не мешает переопределить ее в дальнейшем)
     */
    /*override fun rotate() {
        super.rotate()

        // do something
    }*/

    /**
     * Чтобы запретить переопределение вашей реализации в подклассах, добавьте в объявление
     * переопределяющей версии модификатор final.
     */
    final override fun rotate() {
        super.rotate()

        // do something
    }
}

class RectangleWithTopRoundCorners : RectangleWithRoundCorners () {
    override var width: Double
        get() = super.width
        set(value) {}
    override var height: Double
        get() = super.height
        set(value) {}

    // Невозможно, если данный метод помечен в классе RectangleWithRoundCorners
    // как final.
    /*override fun rotate() {
        super.rotate()
    }*/
}