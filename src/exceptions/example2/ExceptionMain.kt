package exceptions.example2

import data.type.classes.type.sealed_class.example2.HttpCodeExtended
import java.lang.IllegalArgumentException

fun handleException(ex: Exception): HttpCodeExtended =
        when (ex) {
            is IllegalArgumentException -> HttpCodeExtended.BAD_REQUEST because (ex.message ?: "Oops")
            else -> HttpCodeExtended.INTERNAL_SERVER_ERROR("Oops")
        }