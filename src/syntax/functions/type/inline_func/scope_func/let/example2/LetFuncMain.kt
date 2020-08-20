package syntax.functions.type.inline_func.scope_func.let.example2

import java.nio.file.Paths

fun main() {
    val homePath = Paths.get("/home/ss/").let {
        val path = it.resolve("HOME")
        path.toFile().createNewFile()
        path
    }
    println("Output path: $homePath")
}