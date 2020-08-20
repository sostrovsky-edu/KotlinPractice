package syntax.visibility_control.example2

import java.lang.reflect.Modifier

fun main(args: Array<String>) {
    val derivedContainer = DerivedContainer()
    println("\nDerivedContainer.fieldA: ${derivedContainer.fieldA}")
    derivedContainer.printFieldA()

    // will not compile
    /*val container: Container = derivedContainer
    println("fieldA:${container.fieldA}")*/

    println()
    derivedContainer.javaClass.superclass.getDeclaredFields().forEach {
        field->
        field.setAccessible(true)

        println("Field:${field.name}, ${Modifier.toString(field.modifiers)}, Value=${field.get(derivedContainer)}")
    }

    derivedContainer.javaClass.getDeclaredFields().forEach {
        field->
        field.setAccessible(true)

        println("Field:${field.name}, ${Modifier.toString(field.modifiers)}, Value=${field.get(derivedContainer)}")
    }
}

open class Container {
    protected open val fieldA: String = "\"Container\" class value"
}

class DerivedContainer : Container() {
    public override val fieldA: String = "\"DerivedContainer\" class value"

    fun printFieldA() = println("Container.fieldA: ${super.fieldA}")
}