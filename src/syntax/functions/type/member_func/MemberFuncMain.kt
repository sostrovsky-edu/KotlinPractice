package syntax.functions.type.member_func

fun main(args: Array<String>) {
    val rectangle = Rectangle
    rectangle.printArea(10, 20)
}

object Rectangle {
    fun printArea(width: Int, height: Int): Unit {
        val area = calculateArea(width, height)
        println("\nThe area of the rectangle is: $area")
    }

    fun calculateArea(width: Int, height: Int): Int {
        return width * height
    }
}