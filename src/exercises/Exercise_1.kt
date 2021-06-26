package exercises

import kotlin.math.min

fun main() {
    // Даны два массива: [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3]
    // надо вернуть [1, 2, 2, 3] (порядок неважен)


    print("1. ${getRepeatedIntersection_MySolution(
            listOf(1, 2, 3, 2, 0),
            listOf(5, 1, 2, 7, 3, 2)
    )}")

    print("\n2. ${getRepeatedIntersection(
            intArrayOf(1, 2, 3, 2, 0), 
            intArrayOf(5, 1, 2, 7, 3, 2)
    )}")
}

fun getRepeatedIntersection_MySolution(list_1: List<Int>, list_2: List<Int>): MutableList<Int> {
    val result_List = mutableListOf<Int>()

    for (list_1_value in list_1) {
        if (!result_List.contains(list_1_value) && list_2.contains(list_1_value)) {
            val list_1_value_repeat_In_List1 = list_1.filter { it == list_1_value }
            val list_1_value_repeat_sum_In_List1 = list_1_value_repeat_In_List1.size

            val list_1_value_repeat_In_List2 = list_2.filter { it == list_1_value }
            val list_1_value_repeat_sum_In_List2 = list_1_value_repeat_In_List2.size

            val min_repeat_sum = min(list_1_value_repeat_sum_In_List1, list_1_value_repeat_sum_In_List2)

            for (i in 0 until min_repeat_sum) {
                result_List.add(list_1_value)
            }
        }
    }
    result_List.sortBy { it }

    return result_List
}

fun getRepeatedIntersection(arr_1: IntArray, arr_2: IntArray): List<Int> {
    val s1 = arr_1.toHashSet()
    val s2 = arr_2.toHashSet()

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(arr_1.count { it == el}, arr_2.count { it == el })
            repeat(numOfRepeats) { result.add(el) }
        }
    }

    return result
}