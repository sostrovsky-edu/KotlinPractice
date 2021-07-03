package data.type.classes.type.sealed_class.example2

fun main() {
    HttpCodeExtended.I_AM_A_TEAPOT.apply {
        getSomeHotHttpWater(this)
    }

    val badRequest = HttpCodeExtended.BAD_REQUEST because ("Server is not available...")
    println(httpCodeExToHttpMessage(badRequest))
}

sealed class HttpCodeExtended(val code: Int, val msg: String) {
    object OK : HttpCodeExtended(200, "OK")
    class BAD_REQUEST(reason: String) : HttpCodeExtended(400, reason) {
        companion object {
            infix fun because(reason: String) = BAD_REQUEST(reason)
        }
    }
    class FORBIDDEN(reason: String) : HttpCodeExtended(403, reason)
    object I_AM_A_TEAPOT : HttpCodeExtended(418, "Some tea?") {
        fun boilMeSomeWater(): Unit = println("Start boiling...")
    }
    class INTERNAL_SERVER_ERROR(reason: String): HttpCodeExtended(500, reason)
}

fun httpCodeExToHttpMessage(code: HttpCodeExtended): String =
        when (code) {
            is HttpCodeExtended.OK -> "OK"
            is HttpCodeExtended.BAD_REQUEST -> "BAD REQUEST"
            is HttpCodeExtended.FORBIDDEN -> "FORBIDDEN"
            is HttpCodeExtended.I_AM_A_TEAPOT -> "I_AM_A_TEAPOT"
            is HttpCodeExtended.INTERNAL_SERVER_ERROR -> "INTERNAL_SERVER_ERROR"
            // else -> "Unknown code"
        }

fun getSomeHotHttpWater(code: HttpCodeExtended): Unit =
        when(code) {
            is HttpCodeExtended.I_AM_A_TEAPOT -> code.boilMeSomeWater()
            else -> Unit
        }