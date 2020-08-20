package syntax.functions.parameters

fun main(args: Array<String>) {
    val str = "a kindness of ravens"

    // Check to see whether the first string contains a substring of the second
    // #1
    str.regionMatches(14, "Red Ravens", 4, 6, true)

    // #2
    str.regionMatches(thisOffset = 14, other = "Red Ravens", otherOffset = 4, length = 6, ignoreCase = true)

    // When calling a function, not all parameters need to be named.
    // The rule is simple: once a parameter has been named, all the following parameters must be named too.
    // #1
    deleteFiles("*.jpg", true, true, false)

    // #2
    deleteFiles("*.jpg", recursive = true, ignoreCase = true, deleteDirectories = false)


    // "Named parameters" also allow the parameter order to be changed to suit the caller.
    // #1
    str.endsWith(suffix = "ravens", ignoreCase = true)

    // #2
    str.endsWith(ignoreCase = true, suffix = "ravens")
}

// Function accepts multiple Boolean parameters.
// And without named parameters, it is easy to swap arguments erroneously
fun deleteFiles(filePattern: String, recursive: Boolean, ignoreCase: Boolean, deleteDirectories: Boolean): Unit {}