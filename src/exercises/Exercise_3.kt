package exercises

fun main() {
    val wordsList = listOf("eat", "tea", "tan", "ate", "nat", "bat") // -> [ ["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]

    print("1.")
    val values = groupWords_MySolution(wordsList).values
    for (value in values) {
        print("${value?.sortedBy { it }}")
    }

    print("\n2.${groupWords(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))}")
}

fun groupWords_MySolution(wordsList: List<String>): HashMap<String, MutableSet<String>?> {
    val result = mutableListOf<Set<String>>()

    val sortedWordList = mutableListOf<String>()
    for (word in wordsList) {
        val wordWithSortedLetters = word.toCharArray().sortedBy { it }.toString()
        sortedWordList.add(wordWithSortedLetters)
    }

    val sortedWordsMap = HashMap<String, MutableSet<String>?>()
    for (i in sortedWordList.indices) {
        val word = sortedWordList[i]

        val sameWordPositions = mutableListOf<Int>()
        for (j in i until sortedWordList.size) { // 0, 1, 3 eat ___ 2, 4 tan ___ 5 bat
            if (sortedWordList[j] == word) {
                sameWordPositions.add(j)
            }
        }

        val sameWords = when (!sortedWordsMap.containsKey(word)) { // && sameWordPositions.isNotEmpty()) {
            true -> mutableSetOf()
            false -> sortedWordsMap[word]
        }

        for (pos in sameWordPositions) {
            sameWords?.add(wordsList[pos])
        }
        sortedWordsMap[word] = sameWords
                // sameWords?.sortedBy { it }
    }

    return sortedWordsMap
}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord)) {
            map[sortedWord]?.add(word)
        } else {
            map[sortedWord] = mutableListOf(word)
        }
    }

    for((key, value) in map) {
        result.add(value)
    }

    return result
}