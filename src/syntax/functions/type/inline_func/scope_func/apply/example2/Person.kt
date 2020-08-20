package syntax.functions.type.inline_func.scope_func.apply.example2

data class Person(var name: String? = null, var age: Int? = null) {
    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}