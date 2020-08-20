package syntax.functions.type.inline_func.scope_func.apply.example3

fun main() {
    // #1
    val taskRegular = Runnable { println("Running") }
    val thread = Thread(taskRegular)
    thread.setDaemon(true)
    thread.start()

    // #2
    val taskApply = Runnable { println("Running") }
    Thread(taskApply).apply { setDaemon(true) }.start()
}