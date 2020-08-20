package data.type.classes.type.enum_class.example3

import java.util.*

fun main(args: Array<String>) {
    println("\nCurrent day is: ${getCurrentDayName()}")

    Utils.printCollection(Planet.values(), "Planets")

    val planet = Planet.valueOf("JUPITER")
    println("\nPlanet: " +
            "\n\tname: $planet" +
            "\n\tmass: ${planet.mass}" +
            "\n\tradius: ${planet.radius}"
    )

    val helloWord = Word.HELLO
    helloWord.print()
}

fun getCurrentDayName(): WeekDay {
    val dayNum = Calendar.getInstance().get(Calendar.DAY_OF_WEEK) - 1

    return WeekDay.values().get(dayNum)
}
