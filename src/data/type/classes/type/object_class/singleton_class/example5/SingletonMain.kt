package data.type.classes.type.object_class.singleton_class.example5

import java.io.File

/**
 * Реализуем компаратор, сравнивающий пути к файлам без учета регистра.
 */
fun main() {
    println("1. Compare result: " +
            "${CaseInsensitiveFileComparator.compare(File("/User"), File("/user")) == 0}")

    val files = listOf(File("/Z") , File( "/a"))
    println("2. Sort result: ${files.sortedWith(CaseInsensitiveFileComparator)}")
}

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}