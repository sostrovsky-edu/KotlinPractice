package syntax.functions.type.lambda_func.example7

/**
 * Одно важное отличие Kotlin от Java состоит в том, что Kotlin не ограичивается доступом только к финальным переменным.
 * Вы можете изменять переменные внутри лямбда-выражений. Следующий листинг подсчитывает количество клиентских и
 * серверных ошибок в данном наборе кодов ответа.
 */
fun main() {
    val responses = listOf("200 ОК", "418 I'm а teapot", "500 Internal Server Error")
    printProЫemCounts(responses)
}

fun printProЫemCounts(responses: Collection<String>) {
    var сlientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            сlientErrors++
        } else if(it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$сlientErrors client errors, $serverErrors server errors")
}