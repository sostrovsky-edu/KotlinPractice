package syntax.functions.type.extension_func.example4

fun main(args: Array<String>) {
    val selenium = Element("Selenium")
    selenium.react(Particle())
    selenium.react(Electron())

    val neon = NobleGas("Neon")
    neon.react(Particle())
    neon.react(Electron())
}

open class Element(val name: String) {
    open fun Particle.react(name: String): Unit {
        println("$name is reacting with a particle")
    }

    open fun Electron.react(name: String): Unit {
        println("$name is reacting with an electron to make an isotope")
    }

    fun react(particle: Particle): Unit {
        particle.react(name)
    }

    /*fun react(particle: Electron): Unit {
        particle.react(name)
    }*/
}

class NobleGas(name: String) : Element(name) {
    override fun Particle.react(name: String): Unit {
        println("$name is noble, it doesn't react with particles")
    }
    override fun Electron.react(name: String): Unit {
        println("$name is noble, it doesn't react with electrons")
    }
    fun react(particle: Electron): Unit {
        particle.react(name)
    }
}

open class Particle() { }

class Electron(): Particle() { }