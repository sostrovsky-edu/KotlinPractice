package syntax.control_flow.`when`.example3

fun main(args: Array<String>) {
    whenWithoutArgs(3, 5)
    whenWithoutArgs(30, 5)
    whenWithoutArgs(30, 30)
}

fun whenWithoutArgs(x: Int, y: Int) {
    when {
        x < y -> println("x is less than y")
        x > y -> println("X is greater than y")
        else -> println("X must equal y")
    }
}