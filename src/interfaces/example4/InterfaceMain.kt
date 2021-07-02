package interfaces.example4

fun main() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

/**
 * В интерфейсах ключевые слова "final", "open" и "abstract" не используются.
 * Все методы в интерфейсе по умолчанию снабжены модификатором "open"; вы не сможете объявить их закрытыми "final.
 * В отсутствие реализации метод будет считаться абстрактным, а ключевое слово "abstract" можно опустить.
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(value: Boolean) = println("I've ${if (value) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    // Вы допжны явно реализовать метод, еспи наспедуется несколько ero реализаций
    override fun showOff() {
        // Ключевое спово "super<super_type>" определяет родителя, чей метод будет вызван
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}