package data.type.classes.type.sealed_class.example3

/**
 * В Kotlin 1.0 модификатор "sealed" накладывает серьезные ограничения.
 * Например, все подклассы должны быть вложенными, и подкласс не может быть классом данных (data class).
 *
 * Kotlin 1.1 ослабляет эти ограничения и позволяет определять подклассы запечатанных классов в любом месте в том же
 * файле.
 */
fun main() {
    val num1 = Expr.Num(3)
    val num2 = Expr.Num(5)
    val sum = Expr.Sum(num1, num2)

    println("(${num1.value}+${num2.value})=${eval(sum)}")
}

// Impossible: "Modifier 'sealed' is not applicable to 'interface'"
// sealed interface Move {}

// Представление выражений запечатанными классами
sealed class Expr {
    // и перечислить все возможные подклассы в виде впоженных кпассов.
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

// Выражение when() охвать1вает все возможные
// варианты, поэтому ветка «else» не нужна.
fun eval(e: Expr) : Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.right) + (eval(e.left))
        }