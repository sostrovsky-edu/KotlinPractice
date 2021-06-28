package syntax.functions.type.extension_func.example6

import joinStrings

fun main () {
    val list = listOf(1, 2, 3)
    println("1. List items joined to string: ${list.joinToString()}")
    println("2. List items joined to string: ${list.joinToString(separator = "; ", prefix = "{", postfix = "}")}")

    val arrayList = arrayListOf("A", "B", "C")
    println("3. ArrayList items joined to string: ${arrayList.joinToString()}")
    println("4. ArrayList items joined to string: ${arrayList.joinStrings()}")

    // Kotlin: Type mismatch: inferred type is List<Int> but Collection<String> was expected
    // println("5. List items joined to string: ${list.joinStrings()}")

    /**
     * Важные замечания:
     *  1. Функции расширения не переопреляются -> она фактически статический метод класса.
     *      fun View.showOff() = println("I'm а view!")
     *      fun Button.showOff() = println("I'm а button!")
     *
     *      val view:View = Button()
     *      view.showOff()
     *      -> I'm а view!
     *  2. Если в классе есть метод, с точно такой же сигнатурой как у фунции-расширения, то приоритет будет
     *      отдаваться ему, а не функции-расширения.
     *      Если в класс добавить метод с такой же сигнатурой как у объявленной ранее функции-расширения, то после
     *      перекомпиляции код клиента изменит свою семантику и начнет ссылаться на новый метод класса.
     */
}