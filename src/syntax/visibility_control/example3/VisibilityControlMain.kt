import interfaces.example4.Focusable

fun main() {
//    TalkativeButton().giveSpeech()
}

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey !")
    protected fun whisper() = println("Let's talk!")
}

/**
 * Ошибка: «публичный> чпен класса раскрывает
 * <внутреннию> тип-приемник <TalkativeButton>
 * Compile Error:
 *      Kotlin: 'public' member exposes its 'internal' receiver type TalkativeButton
 */
//fun TalkativeButton.giveSpeech() {
//    // Ошибка: функция "yell()" недоступна;
//    // в классе <TalkativeButton> она объявлена с модификатором "private"
//    yell()
//
//    // Ошибка: функция "whisper" недоступна;
//    // в классе <TalkativeButton> она объявлена с модификатором "protected"
//    whisper()
//}
