package Utils

fun <K, V> printMap(collection: HashMap<K, V>, title: String) {
    printTitle(title);
    printCollection(collection)
}

fun <T> printCollection(collection: Collection<T>, title: String) {
    printTitle(title);
    printCollection(collection.iterator())
}

fun <K, V> printCollection(collection: HashMap<K, V>) {
    // entries.forEach(println("\tkey: $entries."))
    for ((k, v) in collection) {
        println("\tkey: $k\tvalue: $v")
    }
}

fun <T> printCollection(collection: Array<T>) {
    printCollection(collection.iterator())
}

fun <T> printCollection(collection: Array<T>, title: String) {
    printTitle(title);
    printCollection(collection.iterator())
}

fun printCollection(array: IntArray, title: String) {
    printTitle(title);
    printCollection(array.iterator())
}

fun printTitle(title: String) {
    println("\n$title:")
}

fun <T> printCollection(iterator: Iterator<T>) {
    while (iterator.hasNext()) {
        println("\titem: ${iterator.next()}")
    }
}