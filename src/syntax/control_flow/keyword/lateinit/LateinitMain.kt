package syntax.control_flow.keyword.lateinit

fun main(args: Array<String>) {
    val test = SqlTests()
    test.dbConnType = "MySql"

    println("\nConnection to: ${test.dbConnType}")
}

class SqlTests {
    lateinit var dbConnType: String
}