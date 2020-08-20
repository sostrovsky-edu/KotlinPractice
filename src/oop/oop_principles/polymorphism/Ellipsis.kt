package oop.oop_principles.polymorphism

class Ellipsis : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        val radiusX = width / 2
        val radiusY = height / 2
        val centerX = locationX + radiusX
        val centerY = locationY + radiusY

        if (radiusX == 0.0 || radiusY == 0.0)
            return false

        val normalizedX = centerX - locationX
        val normalizedY = centerY - locationY
        return (normalizedX * normalizedX) / (radiusX * radiusX) + (normalizedY * normalizedY) /
                (radiusY * radiusY) <= 1.0
    }
}