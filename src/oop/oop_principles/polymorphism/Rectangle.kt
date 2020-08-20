package oop.oop_principles.polymorphism

class Rectangle : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        return x >= locationX && x <= (locationX + width) && y >= locationY && y <= (locationY + height)
    }
}