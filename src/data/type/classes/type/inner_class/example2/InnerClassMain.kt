package data.type.classes.type.inner_class.example2

fun main() {
    val line1 = BasicGraphWithInner("First line")
    line1.draw()

    val line2 = line1.InnerLine(1, 0, -2, 0)
    line2.draw()

    val tempA = A()
    val tempB = tempA.B();
    tempB.foo("Temp")
}

class BasicGraphWithInner(graphName: String) {
    private val name: String

    init {
        name = graphName
    }

    inner class InnerLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("\nDrawing Line from ($x1:$y1) to ($x2, $y2) \nfor graph: \"$name\"")
        }
    }

    fun draw(): Unit {
        println("\nDrawing the graph: \"$name\"")
    }
}

class A {
    private val someField: Int = 1

    inner class B {
        private val someField: Int = 2

        fun foo(s: String) {
            println("\nField \"someField\" from:" +
                    "\n\tB: " + this.someField+
                    "\n\tB: " + this@B.someField+
                    "\n\tA: " + this@A.someField)
        }
    }
}