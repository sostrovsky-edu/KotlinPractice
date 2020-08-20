package syntax.control_flow.keyword.continue_break

fun main(args: Array<String>) {
    println("\nExample of of using \"break\", \"continue\"...")

    myLabel@ for(x in 1..10) { // applying the custom label
        if(x == 5) {
            println("I am inside if block with value: $x \n\thence it will close the operation")
            break@myLabel // specifying the label
        } else {
            println("I am inside else block with value: $x")
            continue@myLabel
        }
    }
}