package data.type.classes.type.sealed_class.example2

sealed class HttpCodeExtended(val code: Int, val msg: String) {
    object OK : HttpCodeExtended(200, "OK")
    class BAD_REQUEST(reason: String) : HttpCodeExtended(400, reason) {
        companion object {
            infix fun because(reason: String) = BAD_REQUEST(reason)
        }
    }
    class FORBIDDEN(reason: String) : HttpCodeExtended(403, reason)
    object I_AM_A_TEAPOT : HttpCodeExtended(418, "Some tea?") {
        fun boilMeSomeWater(): Unit = TODO()
    }
    class INTERNAL_SERVER_ERROR(reason: String): HttpCodeExtended(500, reason)
}