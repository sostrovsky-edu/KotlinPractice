package syntax.functions.type.operator_func.example2

fun main(args: Array<String>) {
    val m1 = Matrix(1, 2, 3, 4)
    val m2 = Matrix(5, 6, 7, 8)

    // #1
    // val m3 = m1 + m2
    // #2
    val m3 = m1.plus(m2)
}

class Matrix(val a: Int, val b: Int, val c: Int, val d: Int) {
    // Operator function
    operator fun plus(matrix: Matrix): Matrix {
        return Matrix(a + matrix.a, b + matrix.b, c + matrix.c, d + matrix.d)
    }
}