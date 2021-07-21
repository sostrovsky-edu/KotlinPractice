package syntax.nullability.example3

/**
 * При менение оператора безопасного вызова для доступа к свойствам, способным прини мать значение nuLL
 */
fun main() {
    val ceo = Employee("Da Boss",null)
    val developer = Employee("Bob Smith", ceo)

    println("1. ${managerName(developer)}")
    println("2. ${managerName(ceo)}")
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name
