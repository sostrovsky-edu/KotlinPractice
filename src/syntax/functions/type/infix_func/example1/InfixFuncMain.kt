package syntax.functions.type.infix_func.example1

fun main(args: Array<String>) {
    val account = Account()
    account.add(100.00)

    val account2 = InfixAccount()
    account2 add 100.00

    val pair = "London" to "UK"
    val pair1 = Pair("london", "paris")
    val pair2 = "london" to "paris"

    val map1 = mapOf(Pair("London", "UK"), Pair("Bucharest", "Romania"))
    val map2 = mapOf("London" to "UK", "Bucharest" to "Romania")

    // is useful for unit-tests
    // myList should contain(x)
    // myString should startWith("foo")
}

/*class FilePath() {
    infix fun concat(other:String): String {
        return this + other
    }
}*/

class Account {
    var balance = 0.0

    fun add(amount: Double): Unit {
        this.balance = balance + amount
    }
}

class InfixAccount {
    var balance = 0.0

    infix fun add(amount: Double): Unit {
        this.balance = balance + amount
    }
}
