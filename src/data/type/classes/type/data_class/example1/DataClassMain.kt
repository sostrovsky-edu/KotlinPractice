package data.type.classes.type.data_class.example1

data class MyPOKO(var value: String)

/*
class MyPOKO(var value: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val myPOKO = other as MyPOKO
        return value == myPOKO.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString(): String {
        return "MyPOKO{'$value'}"
    }
}*/
