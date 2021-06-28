package syntax.properties.regular_property.example2

fun main(args: Array<String>) {
    val base = Base()
    println("\nClass \"Base\" property value: ${base.property1}")

    val derived1 = Derived1()
    println("\nClass \"Derived1\" property value: ${derived1.property1}")

    val derived2 = Derived2("Derived2::value")
    println("\nClass \"Derived2\" property value: ${derived2.property1}")
}

open class Base {
    open val property1: String
        get() = "Base::value"
}

class Derived1 : Base() {
    override val property1: String
        get() = "Derived1::value"
}

class Derived2(override val property1: String) : Base() {}