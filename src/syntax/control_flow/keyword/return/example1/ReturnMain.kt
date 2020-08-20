package syntax.control_flow.keyword.`return`.example1

fun main(args: Array<String>) {
    var x:Int = 10
    println("\nThe value of X is: "+ doubleMe(x))
}
fun doubleMe(x:Int):Int {
    return 2*x;
}