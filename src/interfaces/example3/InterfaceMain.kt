package interfaces.example3

import java.io.InputStream
import java.io.OutputStream

fun main(args: Array<String>) {
    val document = DocumentImpl()
    println("File info: " +
            "\n\tname: ${document.name}"+
            "\n\tversion: ${document.version}"+
            "\n\tsize: ${document.size}"+
            "\n\tdescription: ${document.getDescription()}")
}

interface Document {
    val version: Long
    val size: Long

    val name: String
        get() = "NoName"

    fun save(input: InputStream)
    fun load(stream: OutputStream)
    fun getDescription(): String {
        return "Document $name has $size byte(-s)"
    }
}

class DocumentImpl : Document {
    override val version: Long
        get() = 0

    override val size: Long
        get() = 0

    override fun save(input: InputStream) {}

    override fun load(stream: OutputStream) {}
}