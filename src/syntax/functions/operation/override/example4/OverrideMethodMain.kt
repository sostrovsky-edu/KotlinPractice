package syntax.functions.operation.override.example4

fun main() {
    // Animated() // Error
}

// Это абстрактный кпасс:
//      нельзя создать ero экземпляр
abstract class Animated {

    // Это абарактная функция:
    //      она не имеет реапиэации и должна бьпь переопределена в подклассах
    abstract fun animate()

    // Конкретные функции в абстрактных классах по умолчанию закрыть,
    // но их можно сделать открытыми.
    open fun stopAnimating() {}
    fun animateTwice() {}
}