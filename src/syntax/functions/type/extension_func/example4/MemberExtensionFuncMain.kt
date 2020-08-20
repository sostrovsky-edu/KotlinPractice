package syntax.functions.type.extension_func.example4

class Mappings {
    private val map = hashMapOf<Int, String>()

    // Extension functions are usually declared at the top level, but we can define them inside classes as members.
    // This may be used if we want to limit the scope of an extension
    //
    private fun String.stringAdd(): Unit {
        // "extension receiver" - String instance
        map.put(hashCode(), this)

        // "dispatch receiver" - "Mappings" instance.
        map.put(this@Mappings.hashCode(), this)
    }

    fun add(str: String): Unit = str.stringAdd()
}