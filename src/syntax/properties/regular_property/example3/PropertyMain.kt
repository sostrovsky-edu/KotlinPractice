package syntax.properties.regular_property.example3

fun main(args: Array<String>) {
    val baseB = BaseB("BaseB:value")
    val derivedB = DerivedB()
    derivedB.propertyFoo = "on the spot value"

    println("\nBaseB:${baseB.propertyFoo}")
    println("DerivedB:${derivedB.propertyFoo}")
}

// You can override a "val" property with "var" if your coding logic requires this,
// but the reverse is not possible.
open class BaseB(open val propertyFoo: String) {}

class DerivedB : BaseB("") {
    private var _propFoo: String = ""
    override var propertyFoo: String
        get() = _propFoo
        set(value) {
            _propFoo = value
        }
}

