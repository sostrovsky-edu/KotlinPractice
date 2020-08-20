package data.type.classes.type.nested_class.example3

fun main(args: Array<String>) {
    val line1 = BasicGraph("First line")
    line1.draw()

    val line2 = BasicGraph.Line(1, 0, -2, 0)
    line2.draw()
}

class BasicGraph(val name: String) {
    class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
        fun draw(): Unit {
            println("\nDrawing Line from ($x1:$y1) to ($x2, $y2)")
        }
    }

    fun draw(): Unit {
        println("\nDrawing the graph: \"$name\"")
    }
}
