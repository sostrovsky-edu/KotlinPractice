package data.type.classes.type.singleton_class.example2

fun main(args: Array<String>) {
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
