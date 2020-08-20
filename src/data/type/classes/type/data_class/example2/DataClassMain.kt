package data.type.classes.type.data_class.example2

fun main(args: Array<String>) {
    val book = Book("Kotlin", "TutorialPoint.com", 5)

    println("\nBook:" +
            "\n\tname: ${book.name}" +
            "\n\tpublisher name: ${book.publisher}" +
            "\n\treview of the book is: ${book.reviewScore}"
    )

    book.reviewScore = 7
    println("\nPrinting all the book info together: \n\t${book.toString()}")

    //using inbuilt function of the data class
    println("\nExample of the hashCode function: ${book.hashCode()}")
}

data class Book(val name: String, val publisher: String, var reviewScore: Int)