package exceptions.example3

fun main(args: Array<String>) {
    try {
        val str = "Tutorialspoint.com";
        str.toInt();
    } catch(e:Exception) {
        e.printStackTrace();
    } finally {
        println("Exception Handling in Kotlin");
    }
}