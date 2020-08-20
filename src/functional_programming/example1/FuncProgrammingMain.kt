package functional_programming.example1

class ErrorProcessor {

    /*
    // #1
    fun buildErrorDescList(): List<String> {
        val errorList = getErrorList()
        return stringifyList(errorList, ::anyToString)
    }*/


    /*
    // #2
    fun buildErrorDesc(e: Error): String = e.toString()

    fun buildErrorDescList(): List<String> {
        val errorList = getErrorList()
        return stringifyList(errorList, this::buildErrorDesc)
    }*/

    /*
    // #3
    fun buildErrorDescList(): List<String> {
        val errorList = getErrorList()

        // #1
        return stringifyList(errorList,
            // #1
            // fun(e: Error): String {
            //    return e.toString()
            // }

            // #2
            // fun(e): String {
            //    return e.toString()
            // }

            // #3
            // fun(e) = e.toString()

            // #4
            // { e: Error -> e.toString() }

            // #5
            // { e -> e.toString() }
        )

        // #2
        // такая запись возможна, если функциональный тип передается последним параметром в функции.
        return stringifyList(errorList) {
            e -> e.toString()
        }

        // #3
        // если у функции только один аргумент и мы не хотим его именовать, то Kotlin вместо него подставляет "it"
        return stringifyList(errorList) { it.toString() }
    }*/
}

fun <T> stringifyList(list: List<T>, f: (T) -> String): List<String> {
    val res = mutableListOf<String>()
    for (e in list) {
        // #1
        res.add(f.invoke(e))

        // #2
        res.add(f(e))
    }
    return res
}