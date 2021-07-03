package syntax.constructors.example4

/**
 * Тема знакомая Android-разработчикам
 */
open class View {
    // Вторичные конструкторы (Secondary constructors)
    /*constructor(ctx: Context) {
        // некоторый код
    }
    constructor(ctx: Context, attr: AttributeSet) {
        // некоторый код
    }*/
}

class MyButton : View() {
    // Вызов конструкторов супер-класса
    /*constructor(ctx: Context) : super(ctx) {
        // некоторый код
    }
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)*/

    // Делегирует выполнение другому конструктору этого же класса
    /*constructor(ctx: Context) : this(ctx, MY_STYLE) {
        // некоторый код
    }*/
}