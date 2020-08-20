package syntax.functions.type.inline_func.scope_func.with.example1

fun main() {
    /*val g2 = Graphics2D()

    // #1
    // Regular call
    g2.stroke = BasicStroke(10F)
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
    g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE)
    g2.background = Color.BLACK

    // With{} call"
    with(g2) {
        stroke = BasicStroke(10F)
        setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE)
        background = Color.BLACK
    }*/

    val person2 = Person()
    with(person2) {
        name = "Test User#2"
        age = 18
        println("\nName: $name")
        println("Age: $age")
    }
}

class Person {
    var name: String? = null
    var age: Int? = null

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}