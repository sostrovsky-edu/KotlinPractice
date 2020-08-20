package syntax.functions.type.lambda_func.example1

fun main(args: Array<String>) {
    val myLambda: (String) -> Unit = { s: String -> print(s) }
    val value = "\nTutorialsPoint.com"
    myLambda(value)
}