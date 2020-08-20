package syntax.control_flow.keyword.require

import syntax.functions.type.regular_func.example1.getFirstName
import syntax.functions.type.regular_func.example1.getLastName

fun main(args: Array<String>) {
    require(args.size > 0)

    // #1
    /*
    val firstName: String = args[0]
    var lastName = args[args.lastIndex]
    lastName = "Marley"
    println("Hello, $firstName $lastName")
    */

    // #2
    val firstName = getFirstName(args)
    val lastName = getLastName(args)
    println("Hello, $firstName $lastName")
}

