package syntax.functions.operation.override.example1

fun main() {
    val singleEngineAirplane = CesnaAirplane()
    singleEngineAirplane.fly()
}

abstract class SingleEngineAirplane protected constructor() {
    abstract fun fly()
}

class CesnaAirplane : SingleEngineAirplane() {
    // You can always disallow any "derived classes" from overriding the function by adding the "final" keyword in
    // front of the method.
    // We don't want any of the "Cesna" models to redefine the method
    final override fun fly() {
        println("Flying a cesna")
    }
}

// наследовать нельзя, т.к. класс "CesnaAirplane" по-умолчанию final.
// class Helicopter : CesnaAirplane { }