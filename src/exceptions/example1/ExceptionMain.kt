package exceptions.example1

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
