package syntax.functions.type.lambda_func.example10

import syntax.functions.type.lambda_func.example5.Person

fun main() {
    val persons = listOf(
            Person("Alice", 31),
            Person("Bob", 29),
            Person("Carol", 31)
    )

    /**
     * Каждая группа сохраняется в виде списка, поэтому результат будет иметь тип Map<Int, List<Person>>.
     *
     * Этот словарь, используя функции mapKeys и mapValues.
     */
    println("1. ${persons.groupBy { it.age }.toSortedMap()}")

    val list = listOf("a", "ab", "b")
    println("2. ${list.groupBy(String::first)}")

    /**
     * Задача: получить множество всех авторов в библиотеке
     */
    val books = listOf(
            Book("Thursday next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )
    println("3. ${books.flatMap { it.authors }.toSet()}")

    /**
     * Задача: получить список символов из слов, представленных в исходном списке
     */
    val strings = listOf("abc", "def")
    println("4. ${strings.flatMap { it.toList() }}")

    /**
     * Задача: вывести из списка людей только то имя, которое начинается с буквы 'A'.
     */
    // Данная цепочка вызовов создаст два списка: один - для хранения результатов функции filter() и другой - для
    // результатов функции map().
    // Это не проблема, если в исходном списке всего пара элементов, но в случае со списком из миллиона элементов это
    // может существенно снизить эффективность операции.
    println("5. ${persons.map(Person::name).filter { it.startsWith("A")} }")

    // Для повышения эффективности нужно реализовать операцию с применением последовательностей вместо коллекций
    // При использовании последовательности не будут созданы промежуточные коллекции для хранения элементов, а
    // следовательно, для большого количества элементов производительность будет заметно лучше.
    println("6. ${persons.asSequence().map(Person::name).filter { it.startsWith("A") }.toList()}")

    /**
     * Операции над последовательностями делятся на две категории: промежуточные и завершающие.
     *
     * Промежуточная операция возвращает другую последовательность, которая знает, как преобразовать элементы
     * исходной последовательности.
     * Выполнение промежуточных операций всегда откладывается.
     *
     * Завершающая операция возвращает результат, который может быть коллекцией, элементом, числом или любым другим
     * объектом, полученным в ходе преобразований исходной коллекции.
     * Завершающая операция заставляет выполниться все отложенные вычисления.
     */
    // такой код ничего не выведет на экран, т.к. нет завершающий функции и промежуточные не выполняются
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)"); it * it }
            .filter { print( "filter($it)"); it % 2 == 0 }

    print("7. ")
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it)"); it * it }
            .filter { print( "filter($it)"); it % 2 == 0 }
            .toList()
    println()

    /**
     * Также важно учесть порядок использования промежуточных функций, что влияет на производительность.
     *
     * При реализации <В лоб> к каждому элементу сначала применяется функция map(), а затем вызывается функция
     * filter() для каждого элемента получившейся последовательности.
     * Так функции map() и filter() работают с коллекциями, но не с последовательностями.
     *
     * Для последовательности все операции применяются к каждому элементу поочередно: сначала обрабатывается первый
     * элемент (преобразуется, а затем фильтруется), затем второй и т. д.
     * Такой подход означает, что некоторые элементы могут вовсе не подвергнуться преобразованию, если результат будет
     * вычислен прежде, чем до них дойдет очередь.
     */
    println("8. ${listOf( 1 , 2 , 3 , 4).asSequence()
                    .map { it * it }.find { it > 3 } } ")
    // Если те же операции применить к коллекции вместо последовательности, сначала выполнится функция map(), которая
    // преобразует каждый элемент исходной коллекции в квадрат. А затем, на втором шаге, в промежуточной коллекции
    // будет найден элемент, удовлетворяющий предикату.
    // Отложенные вычисления позволяют пропустить обработку некоторых элементов.

    val people = listOf(
            Person( "Alice", 29),
            Person( "Bob", 31),
            Person( "Charles", 31),
            Person( "Dan", 21))
    // Если применить последовательность map() и filter() в разной последовательности, то получим и различную
    // производительность.
    // Вариант 1: Сначала map(), эатем filter() -> будет преобразован каждый элемент
    println ("9. ${people.asSequence()
                        .map(Person::name)
                        .filter { it.length < 4 }
                        .toList()}")
    // Вариант 2: Сначала filter(), эатем map() -> неподходящие элементы отфильтруются раньше и не будут преобразованы
    println ("9. ${people.asSequence()
                        .filter { it.name.length < 4 }
                        .map(Person::name)            
                        .toList()}")
}

class Book(val title: String, val authors: List<String>)