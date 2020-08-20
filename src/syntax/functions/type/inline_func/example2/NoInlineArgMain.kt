package syntax.functions.type.inline_func.example2

class FunctionStorage(val functionResults: MutableMap<() -> Any, Any>)

inline fun FunctionStorage.run(noinline body: () -> Any) =
        functionResults[body] ?: kotlin.run {
            val res = body()
            functionResults[body] = res
            res
        }