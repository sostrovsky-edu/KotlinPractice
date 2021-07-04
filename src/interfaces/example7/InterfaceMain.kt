package interfaces.example7

/**
 * По умолчанию методы доступа имеют ту же видимость, что и свойство.
 * Но вы можете изменить её, добавив модификатор видимости перед ключевыми словами get и set
 */
fun main() {
    val lengthCounter = LengthCounter()

    lengthCounter.addWord("Hello")
    println("1. Length: ${lengthCounter.counter}")

    lengthCounter.addWord("World!")
    println("2. Length: ${lengthCounter.counter}")
}

class LengthCounter {
    // Значение этого свойава непьзя изменить вне кпасса
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}