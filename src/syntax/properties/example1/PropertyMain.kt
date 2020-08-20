package syntax.properties.example1

import data.type.classes.type.enum_class.example1.SexEnum

fun main(args: Array<String>) {
    val human1 = Human(12, SexEnum.Male)
    val human2 = Human(22, SexEnum.Female)
    human2.isMarried = true;

    val humanList = listOf(human1, human2)

    humanList.forEach{
        println("\nIs human with:" +
                "\n\tage=${it.age} \t\tmature: ${it.isMature}"+
                "\n\tsex=${it.sex} \tmarried: ${it.isMarried}"
        )
    }
}

class Human(val age: Int, val sex: SexEnum) {
    // #1
    /*val isMature: Boolean
        // #1
        get() {
            return 18 < age
        }
        // #2
        get() = 18 < age*/

    // #2
    // backing field will not be created, because there is no default value
    val isMature
        // #1
        /*get() {
            return 18 < age
        }*/
        // #2
        get() = 18 < age

    // backing field will be created
    var isMarried = false
        get() {
            println("Getting isMarried: $field")
            return field
        }
        set(value) {
            if (value == field) return

            println("Setting isMarried to: $value")
            field = value
        }
}