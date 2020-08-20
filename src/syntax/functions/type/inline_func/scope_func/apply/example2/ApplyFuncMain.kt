package syntax.functions.type.inline_func.scope_func.apply.example2


fun main() {
    // #1
    val peterRegular = Person()
    peterRegular.name = "Peter"
    peterRegular.age = 18
    println("\nPeter info (regular): $peterRegular")

    // #2
    // Use the "apply()" function if you are not accessing any functions of the "receiver" within your "block", and
    // also want to return the same "receiver".
    // This is most often the case when initializing a new object.
    val peterApply = Person().apply {
        name = "Peter"
        age = 18
    }
    println("\nPeter info (apply): $peterApply")
}

// Create a chain of calls
/*
private fun insert(user: User) = SqlBuilder().apply {
        append("INSERT INTO user (email, name, age) VALUES ")
        append("(?", user.email)
        append(",?", user.name)
        append(",?)", user.age)
    }.also {
        print("Executing SQL update: $it.")
    }.run {
        jdbc.update(this) > 0
    }*/
