package data.type.strings.example1

fun main(array: Array<String>) {
    val regularString = "\n\tThis \"string\" \be funky"
    println("\n1. Regular string $regularString")

    val rawString = """
        This is a raw "string"
        it \should be printed as-is"""
    println("\n2. Raw string $rawString")

    // string interpolation example
    val dollarString = """
        ${'$'}tring templates shall not pass!"""
    println("\n3. Dollar string $dollarString")

    val escapedString : String  = "I am an escaped String!\n"
    println("\n4. Hello! "+escapedString)

    /**
     * Метод split в Java не работает с точкой:
     *  "12.345-6.А".split(".") вернет не массив [12, 345-6, А], а пустой массив
     * Это происходит потому, что split ожидает получить регулярное выражение и разбивает строку на несколько частей
     * согласно этому выражению. В этом контексте точка (.) - регулярное выражение, соответствующее любому символу.
     *
     * Kotlin скрывает этот метод, вызывающий путаницу, предоставляя сразу несколько перегруженных расширений с
     * именем split и различными аргументами. Перегруженная версия, принимающая регулярное выражение, требует
     * значения типа Regex, а не String. Это однозначно определяет, как будет интерпретироваться строка, переданная
     * методу: как обычный текст или как регулярное выражение.
     */
    val stringToSplit = "12.345-6.А"

    // #1
    println("5. Split result: ${stringToSplit.split("\\.|-".toRegex())}") // Явная передача регулярного выражения

    // #2
    /**
     * Перегруженная версия split в Kotlin принимает произвольное число разделителей в виде обычных строк
     */
    println("6. Split result: ${stringToSplit.split(".", "-" )}") // Передача нескольких разделителей
                                                                            // строкового типа
    // #3
    /**
     * Этот метод заменяет похожий Jаvа-метод, принимающий только один аргумент с символом-разделителем.1
     */
    println("7. Split result: ${stringToSplit.split('.', '-')}") // Передача нескольких разделителей
                                                                            // символьного типа
}