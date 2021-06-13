package data.type.collections.example1

import Utils.printCollection
import Utils.printMap

fun main() {
    val numberList: MutableList<Int> = mutableListOf(1, 2, 3)   // mutable list
    printCollection(numberList, "NumberList")

    val itemToAdd = 4
    print("\nAdding item $itemToAdd to \"numberList\"...")
    numberList.add(4)
    printCollection(numberList, "NumberList")


    val numberList1: List<Int> = numberList                     // immutable list
    printCollection(numberList1, "NumberList1")
    // numberList1.clear()                                      // does not compiles and gives an error

    println("\n\"NumberList1\" info:" +
            "\n\tfirst item: ${numberList.first()}" +
            "\n\tlast item: ${numberList.last()}" +
            "\n\teven numbers: ${numberList.filter{ it % 2 == 0 }}" + // returns [2, 4]
            "\n\tnumbers sum: ${numberList.sum()}") // returns sum: 10


    val hashMap: HashMap<String, Int> = hashMapOf("foo" to 1, "bar" to 2)
    printMap(hashMap, "HashMap")
    println("\n\"HashMap\" info:" +
            "\n\tthe value of the item with key \"foo\" is: ${hashMap["foo"]}")     // prints "1"

    val hashSet = hashSetOf("a", "b", "c", "c")
    println("\n\"HashSet values: $hashSet")

    val numbers = listOf(1, 3, -4, 2, -11)
    val (positives, negatives) = numbers.partition { it > 0 }
    println("\n\"Partitioned by sign values: \n\t$positives, \n\t$negatives")

    val groupedStrings = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
    println("\n\"Strings grouped by length: \n\t$groupedStrings")
}