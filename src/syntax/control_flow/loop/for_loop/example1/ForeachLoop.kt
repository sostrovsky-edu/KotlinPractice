package syntax.control_flow.loop.for_loop.example1

import syntax.functions.type.regular_func.example1.buildGreeting

fun main(args: Array<String>) {
    println(buildGreeting(args))

    // #1
    for (arg in args) {
        val info = arg.split(" ")
        println(buildGreeting(info.toTypedArray()))
    }

    // #2
    for (i in 0..args.lastIndex) {
        val info = args[i].split(" ")
        println(buildGreeting(info.toTypedArray()))
    }

    // #3
    // до последнего элемента не добегаем 1 [0..args.size-1]
    for (i in 0 until args.size) {
        val info = args[i].split(" ")
        println(buildGreeting(info.toTypedArray()))
    }

    //#4
    for (i in args.indices) {
        val info = args[i].split(" ")
        println(buildGreeting(info.toTypedArray()))
    }
}