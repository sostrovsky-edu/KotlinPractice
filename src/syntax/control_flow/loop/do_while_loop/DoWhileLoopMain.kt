package syntax.control_flow.loop.do_while_loop

fun main(args: Array<String>) {
    var x = 0
    do {
        x += 10
        println("I am inside Do block with value: $x")
    } while(x <= 50)
}