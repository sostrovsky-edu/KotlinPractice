package syntax.functions.type.regular_func.example3

fun main(args: Array<String>) {
    val a: A = B()
    println(a.foo(a = 3))
}

open class A {
    open fun foo(a: Int = 1, b: Int = 2): String = "$a$b"
    /*open fun foo(a: Int = 1, b: Int = 2): String {
        println("A: " +
                "\n\ta = $a" +
                "\n\tb = $b"
        )

        return "$a$b"
    }*/

}

class B: A() {
    override fun foo(b: Int, a: Int): String = super.foo(a, b)
    /*override fun foo(b: Int, a: Int): String {
        println("B: " +
                "\n\ta = $a" +
                "\n\tb = $b"
        )

        return super.foo(a, b)
    }*/
}

// NamedArgs
/* fun createConfig(
      sqlDialect: String,
      acidLevel: AcidLevel,
      dbPath: Path,
      threadPoolSize: Int): Config = TODO() */

// DefaultArgs
/* fun createConfig(
        sqlDialect: String = "PostgreSQL",
        acidLevel: AcidLevel = AcidLevel.READ_COMMITED,
        dbPath: Path,
        threadPoolSize: Int = 1): Config = TODO() */

// Wrong call
// val DEFAULT_CONFIG = createConfig(Paths.get("/home/me", "db.file"))

// Good call
// val DEFAULT_CONFIG = createConfig(dbPath = Paths.get("/home/me", "db.file"))