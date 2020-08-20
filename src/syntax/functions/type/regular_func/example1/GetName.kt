package syntax.functions.type.regular_func.example1

/*
fun getFirstName(args: Array<String>): String? {
    if (args.size > 0) return args[0]
    else return null
}

fun getLastName(args: Array<String>): String? {
    if (args.size > 1) return args[args.lastIndex]
    else return null
}*/

// simplified
/*
fun getFirstName(args: Array<String>): String? {
    return if (args.size > 0) args[0]
            else null
}

fun getLastName(args: Array<String>): String? {
    return if (args.size > 1) args[args.lastIndex]
            else null
}*/

// simplified
/*
fun getFirstName(args: Array<String>): String? =
    if (args.size > 0) args[0]
    else null

fun getLastName(args: Array<String>): String? =
    if (args.size > 1) args[args.lastIndex]
    else null*/

// simplified
fun getFirstName(args: Array<String>) =
        if (args.isNotEmpty()) args[0]
        else null

fun getLastName(args: Array<String>) =
        if (args.size > 1) args[1]
        else null

// 1
/*
fun shorten(name: String?): String {
        if (true == name?.isNotEmpty()) {
                return name!!.get(0) + "."
        } else {
                return ""
        }
}*/

// #2
// simplified
/*fun shorten(name: String?): String {
        if (true == name?.isNotEmpty()) {
                return name[0] + "."
        } else {
                return ""
        }
}*/

// #3
// simplified
/*
fun shorten(name: String?): String =
        if (true == name?.isNotEmpty())  name[0] + "."
        else ""
*/

// #4
// simplified
fun shorten(name: String?) =
        if (true == name?.isNotEmpty())  "${name[0]}."
        else ""

