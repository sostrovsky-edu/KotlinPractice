package oop.oop_principles.inheritance.example3

import java.io.InputStream

/**
 * There is no restriction on how many interfaces you can "inherit" from and the order in which you want to
 * specify them.
 *
 * Unlike Java, if you "inherit" from a class and one or more interfaces, you don't need to list the "class" as the
 * first entry in the list of parents:
 */
fun main(args: Array<String>) {
    val doc = TextDocument("The story")
    // doc.save()
    doc.print()
}

interface IPersistable {
    fun save(stream: InputStream)
}

interface IPrintable {
    fun print()
}

abstract class Document(val title: String)

class TextDocument(title: String) : IPersistable, Document(title), IPrintable {
    override fun save(stream: InputStream) {
        println("Saving to input stream")
    }

    override fun print() {
        println("\nDocument name: $title")
    }
}