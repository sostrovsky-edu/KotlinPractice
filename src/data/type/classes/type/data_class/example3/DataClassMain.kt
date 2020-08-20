package data.type.classes.type.data_class.example3

interface Jsonable {
    // fun toJson() : JsonValue = TODO()
}

data class SignUpMsg(val denizenId: String, val password: String, val email: String?) : Jsonable

data class LoginMsg(val denizenId: String, val password: String) : Jsonable

data class InfoMsg(val denizenId: String) : Jsonable

data class MyDataClass(val name: String) : Jsonable {
    override fun toString() = super.toString()
}

// Impossible
// data object EmptyMsg: Jsonable