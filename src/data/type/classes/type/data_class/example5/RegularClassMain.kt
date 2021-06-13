package data.type.classes.type.data_class.example5

fun main() {
    val rectangle_1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle_1.perimeter}")

    val rectangle_2 = Rectangle(5.0, 2.0)
    println("Hashcodes: " +
            "\n\t${rectangle_1.hashCode()}" +
            "\n\t${rectangle_2.hashCode()}" +
            "\n\t${rectangle_1 == rectangle_2}"
    )
}

data class Rectangle(var height: Double, var width: Double) {
    val perimeter = (height + width) * 2

    var test = 1
        get() = field + 1 // like this.поле в Java
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = (height * width)
}