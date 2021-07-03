package data.type.classes.type.nested_class.example2

import java.io.Serializable

fun main() {
    val button = Button()
    val state = button.getCurrentState()
    button.restoreState(state)
}

interface State : Serializable
interface View {
    fun getCurrentState( ) : State
    fun restoreState( state : State) { }
}

class Button : View {
    override fun getCurrentState( ) : State = ButtonState( )
    override fun restoreState( state : State) { /* . . . */ }

    // Это аналог статического вложенного класса в Java
    // В Kotlin вложенный класс без модификаторов это полный аналог статического вложенного класса в Java.
    // Чтобы превратить его во внутренний класс со ссылкой на внешний класс, нужно добавить модификатор "inner".
    class ButtonState : State { /* . . . */ }
}