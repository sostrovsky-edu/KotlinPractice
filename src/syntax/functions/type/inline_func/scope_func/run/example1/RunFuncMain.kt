package syntax.functions.type.inline_func.scope_func.run.example1

import java.nio.file.Paths

fun main() {
    val homePath = Paths.get("/home/ss/").run {
        val path = resolve("HOME")
        path.toFile().createNewFile()
        path
    }
    println("Output path: $homePath")
}