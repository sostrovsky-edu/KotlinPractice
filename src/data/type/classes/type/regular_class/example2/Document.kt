package data.type.classes.type.regular_class.example2

import java.io.InputStream
import java.io.OutputStream

interface Document {
    val version: Long
    val size: Long

    val name: String
        get() = "NoName"

    fun save(input: InputStream)
    fun load(output: OutputStream)
    fun getDescription(): String {
        return "Document $name has $size byte(-s)"
    }
}

class DocumentImpl(): Document {
    override val version: Long
        get() = 0
    override val size: Long
        get() = 0

    override fun save(input: InputStream) {}

    override fun load(output: OutputStream) {}
}