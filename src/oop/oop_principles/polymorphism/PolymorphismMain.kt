package oop.oop_principles.polymorphism

fun main(args: Array<String>) {
    val e1 = Ellipsis()
    e1.height = 10.0
    e1.width = 12.0

    val e2 = Ellipsis()
    e2.locationX = 100
    e2.locationY = 96
    e1.height = 21.0
    e1.width = 19.0

    val r1 = Rectangle()
    r1.locationX = 49
    r1.locationY = 45
    r1.width = 10.0
    r1.height = 10.0

    val shapes = listOf<Shape>(e1, e2, r1)
    val selected:Shape? = shapes.firstOrNull {shape -> shape.isHit(50,52)}
    // val selected:Shape? = shapes.firstOrNull {shape -> shape.isHit(150,152)}

    if(selected == null){
        println("There is no shape at point(50,52)")
    }
    else {
        println("A shape of type ${selected.javaClass.simpleName} has selected.")
    }
}


