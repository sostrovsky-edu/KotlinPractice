package data.type.classes.operation.destructive_declaration.example2

fun main(args: Array<String>) {
    val student = Student("Antonio Banderas", "TangoDance")
    val (name, subject) = student
    println("\nStudent: " +
            "\n\tname: $name"+
            "\n\tsubject: $subject"
    )
}


data class Student(val name: String, val subject: String)