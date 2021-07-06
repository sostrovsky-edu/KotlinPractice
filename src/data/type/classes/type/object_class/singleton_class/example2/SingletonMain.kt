package data.type.classes.type.object_class.singleton_class.example2

fun main() {
    val userData = UserData()
    userData.getFromDB(DBConnection)
}

class UserData {
    fun getFromDB(connection: DBConnection) {
        println("Get user data from ${connection.dbType}")
    }
}

object DBConnection {
    var dbType: String = "MySql"

    init {
        dbType = "Oracle"
    }
}
