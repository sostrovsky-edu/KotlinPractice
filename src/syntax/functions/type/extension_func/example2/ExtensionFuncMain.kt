package syntax.functions.type.extension_func.example2

fun main(args: Array<String>) {
    val list = listOf(1,2,3)
    val droppedList = list.drop(2)
    println("\nThe dropped list is: $droppedList")
}

/**
 * Quite often, you come across a situation where a type that you don't have control over will benefit from an extra
 * function. Maybe you've always wished "String" had a "reverse()" function or perhaps list had a "drop()" function
 * that would return a copy of list with the first k elements removed.
 *
 * An object-orientated approach would be to extend the type, thereby creating a subtype that adds the required new
 * functions:
 */
// #1
abstract class DroppableList<E> : ArrayList<E>() {
    fun drop(k: Int): List<E> {
        val resultSize = size - k

        when {
            resultSize <= 0 -> return emptyList<E>()
            else -> {
                val list = ArrayList<E>(resultSize)
                for (index in k..size - 1) {
                    list.add(this[index])
                }

                return list
            }
        }
    }
}

/**
 * But this isn't always possible. A class may be defined as "final", so you cannot extend it.
 * It may also be the case that you may not control when instances are created, so you can't substitute your subtype
 * for the existing type.
 *
 * A typical solution in this case is to create a function in a separate class that accepts the instance as another
 * argument. In Java, for example, it is quite common to see classes that consist entirely of helper functions for
 * other instances. A good example of this is the "java.util.Collections" class. It contains dozens of
 * "static functions" that offer the functionality for working with collections:
 */
// #2
fun <E> drop(k: Int, list: List<E>): List<E> {
    val resultSize = list.size - k

    when {
        resultSize <= 0 -> return emptyList<E>()
        else -> {
            val newList = ArrayList<E>(resultSize)
            for (index in k..list.size - 1) {
                newList.add(list[index])
            }

            return newList
        }
    }
}

/**
 * The issue with this solution is two-fold:
 *      1. we cannot use code completion in the IDE to see which function is available.
 *              This is because we write the function name first.
 *      2. if we have many of these functions and we want to compose them, we end up with code that isn't particularly
 *          readable. For example, refer to the following:
 *              reverse(take(3, drop(2, list)))
 *
 *          Wouldn't it be nice if we could access this function directly on the list instance so it could give us
 *          code that would compose like the following:
 *              list.drop(2).take(3).reverse()
 *
 * An "extension function" is declared by defining a "top-level function" as normal, but with the intended type
 * prefixed before the function name. The type of the instance that the function will be used on is called the
 * "receiver type".
 * The "receiver type" is said to be extended with the "extension function". Here is our previous "drop()" function
 * again; this time, it is implemented as an "extension function":
 */
// 3
fun <E> List<E>.drop(k: Int): List<E> {
    val resultSize = size - k

    when {
        resultSize <= 0 -> return emptyList<E>()
        else -> {
            val list = ArrayList<E>(resultSize)
            for (index in k..size - 1) {
                list.add(this[index])
            }

            return list
        }
    }
}


