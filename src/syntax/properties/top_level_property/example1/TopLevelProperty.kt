package syntax.properties.top_level_property.example1

// #1
var opCount = 0

fun performOperation() {
    opCount++
    // ...
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}

// #2
val UNIX_LINE_SEPARATOR = "\n"

// const val UNIX_LINE_SEPARATOR = "\n"
// Это эквивалентно следующему коду на Java:
// public static final String UNIX_LINE_SEPARATOR = "\n";