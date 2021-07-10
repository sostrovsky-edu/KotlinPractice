package syntax.functions.type.lambda_func.example5

fun main() {

    /**
     * Если нужно заключить фрагмент кода в блок, используйте библиотечную функцию "run", которая выполнит переданное
     * ей лямбда-выражение
     */
    run { println("1. Hello World!") }


    val people = listOf( Person( "Alice", 29), Person( "Bob", 31))

    /**
     * Поиск в коллекции вручную
     */
    findTheOldest(people)

    /**
     * Поиск в коллекции с помощью лямбда-выражения
     */
    println("3. ${people.maxBy { it.age }}")
    // Если переписать этот код без всяких синтаксических сокращений, получится следующее
    println("3_1. ${people.maxBy({p: Person -> p.age})}")
    // Этот код избыточен.
    //  1. в нем слишком много знаков препинания, что затрудняет чтение.
    //  2. тип легко вывести из контекста, поэтому его можно опустить.
    // И наконец, в данном случае не обязательно присваивать имя аргументу лямбда-выражения.
    // Синтаксис языка Kotlin позволяет вынести лямбда-выражение за круглые скобки, если оно является последним
    // аргументом вызываемой функции. В этом примере лямбда-выражение - единственный аргумент, поэтому его можно
    // поместить после круглых скобок.
    println("3_2. ${people.maxBy() { p: Person -> p.age }}")
    // Когда лямбда-выражение является единственным аргументом функции, также можно избавиться от пустых круглых скобок
    println("3_3. ${people.maxBy { p: Person -> p.age }}")
    // Ещё упростим синтаксис, избавившись от типа параметра.
    println("3_4. ${people.maxBy { p -> p.age }}")
    // Использование имени параметра по умолчанию
    println("3_5. ${people.maxBy { it.age }}")

    /**
     * Лямбда-выражения могут содержать несколько выражений! В таком случае их результат - последнее выражение
     */
    val sum = { x1: Int, y1: Int ->
        println("4.Computing the sum of $x1 and $y1...")
        x1 + y1
    }
    println("\tResult is: ${sum(1, 2)}")
}

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println("2. $theOldest")
}