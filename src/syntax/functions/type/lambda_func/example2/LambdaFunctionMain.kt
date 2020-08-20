package syntax.functions.type.lambda_func.example2

import java.util.*
import javax.lang.model.type.ErrorType

class ErrorProcessor {
    private val freshErrorId
        get() = UUID.randomUUID()

    private val ignoredErrorTypes = mutableSetOf<ErrorType>()

    /*
    fun buildErrorDescList(): List<String> =
            getErrorList()
                    .filter { it.type !in ignoredErrorTypes}
                    .map { freshErrorId to it}
                    .map { (id, error) -> "[$id] ${error.msg}" }
     */
}