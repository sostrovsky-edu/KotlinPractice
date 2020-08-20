package oop.oop_principles.polymorphism

abstract class Shape protected constructor() {
    var locationX: Int = 0
        get() = field
        set(value: Int) {
            field = value
        }

    var locationY: Int = 0
        get() = field
        set(value: Int) {
            field = value
        }

    var width: Double = 0.0
        get() = field
        set(value: Double) {
            field = value
        }

    var height: Double = 0.0
        get() = field
        set(value: Double) {
            field = value
        }

    abstract fun isHit(x: Int, y: Int): Boolean
}