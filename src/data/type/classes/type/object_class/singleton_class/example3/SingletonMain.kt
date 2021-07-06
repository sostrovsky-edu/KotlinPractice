package data.type.classes.type.object_class.singleton_class.example3

import interfaces.example2.LoggingExecutable

fun main() {
    val selectQuery = SelectQuery(
            sqlDialect = "SQLite",
            table = "USER",
            fields = arrayOf("id", "name", "age", "sex")
    )
    println("1. Execute Result: ${selectQuery.execute()}\n")

    val sqlConfig = SqlConfig("Oracle")
    val sqlQuery = SqlQuery(sqlConfig)
    println("2. SqlQuery config has caching: ${sqlQuery.config.hasCaching}\n")

    sqlConfig.hasCaching = true
    println("3. SqlQuery config has caching: ${sqlQuery.config.hasCaching}\n")

    println("4. SqlConfig dialect is default: ${sqlConfig.dialect.isDefault}")
}

class SelectQuery(sqlDialect: String,
                  val table: String,
                  val fields: Array<String>): SqlQuery(), LoggingExecutable {
    override fun execute(): Int = 0
}

open class SqlQuery(val config: SqlConfig) {
    // val dialect = SqlDialect(sqlDialect)

    // #1
    /*constructor(): this("") {
        config.hasCaching = false
    }*/

    // #2
    constructor(): this(DefaultSqlConfig) {
        config.hasCaching = false
    }
}

object DefaultSqlConfig: SqlConfig("") {
    init {
        hasCaching = false
    }
}

open class SqlConfig(sqlDialect: String) {
    val dialect = SqlDialect(sqlDialect)

    var hasCaching = false
        get() {
            println("Getting hasCaching: $field")
            return field
        }
        set(value) {
            if (value == field) return
            println("Setting hasCaching: $field")

            if (value) {
                // Do some caching stuff
            } else {
                // Do some non-caching stuff
            }
            field = value
        }
}

class SqlDialect(val name: String) {
    val isDefault
        get() = "" == name
}


