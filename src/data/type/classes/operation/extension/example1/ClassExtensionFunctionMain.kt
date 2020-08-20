package data.type.classes.operation.extension.example1

fun main(args: Array<String>) {
    var a1 = Alien()
    a1.skills = "JAVA"
    //a1.printMySkills()

    var a2 = Alien()
    a2.skills = "SQL"
    //a2.printMySkills()

    var a3 = Alien()
    a3.skills = a1.addMySkills(a2)
    a3.printMySkills()
}

class Alien {
    var skills: String = "null"

    fun addMySkills(a: Alien): String = "Skills from \"addMySkills()\" inside the \"Alien\" class."

    fun printMySkills() {
        print(skills)
    }
}

fun Alien.addMySkills(a: Alien): String {
    var a4 = Alien()
    a4.skills = this.skills + " " + a.skills
    return a4.skills
}