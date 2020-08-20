package syntax.control_flow.`when`.example1

fun main(args: Array<String>) {
    val x:Int = 5
    when (x) {
        // #1
        /*1 -> print("x = = 1")
        2 -> print("x = = 2")*/

        // #2
        1,2 -> print(" Value of X either 1,2")

        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}