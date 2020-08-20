package exceptions.example1

import data.type.classes.type.singleton_class.example3.SqlQuery
import interfaces.example2.LoggingExecutable

/*
class SelectQuery() : SqlQuery(sqlDialect), LoggingExecutable {
    override fun execute(): Int {
        return try {
            // #1
            if (conn == null) {
                throw SqlException("SQL connection failed!)
            }

            // #2
            conn ?. throw SqlException("SQL connection failed!)

            recordCount()
        } catch (ex: SqlException) {
            log.error("Oops, exception: ${ex.message}")
        } finally {
            doSomethingMore()
        }
    }
}*/
