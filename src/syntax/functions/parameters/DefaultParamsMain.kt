package syntax.functions.parameters

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors


fun main(args: Array<String>) {
    // Good call
    divide(BigDecimal(12.34))
    divide(BigDecimal(12.34), 8)
    divide(BigDecimal(12.34), 8, RoundingMode.HALF_DOWN)

    // But the following would not be legal:
    // divide(BigDecimal(12.34), RoundingMode.HALF_DOWN)

    // However, to solve this problem, we can mix named parameters and default parameters:
    divide(BigDecimal(12.34), roundingMode = RoundingMode.HALF_DOWN)
}

/**
 * Sometimes, it is convenient to provide default values for parameters in a function. Let's say we want to create a
 * thread pool.
 * The parameter to set the number of threads could default to the number of CPU cores. This would be a sensible
 * default, but the user might still want to use something different.
 * The way to achieve this in languages without default parameters is to offer overloaded versions of the same
 * function.
 */
fun createThreadPool(): ExecutorService {
    val threadCount = Runtime.getRuntime().availableProcessors()
    return createThreadPool(threadCount)
}
fun createThreadPool(threadCount: Int): ExecutorService {
    return Executors.newFixedThreadPool(threadCount)
}

/**
 * However, sometimes the number of parameters means that we end up with many overloaded variations of the same
 * function, resulting in needless boilerplate. For example, the Java standard library "BigDecimal" has the following
 * functions:
 *      public BigDecimal divide(BigDecimal divisor)
 *      public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode)
 *      public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
 *
 * In Kotlin, a function can define one or more of its parameters to have default values, which are used if the
 * arguments are not specified. This allows a single function to be defined for several use cases, thereby avoiding
 * the need for multiple overloaded variants.
 * Here is the "divide()" function again, but this time, by using default parameters, we can reduce the definition
 * to a single function:
 */
fun divide(divisor: BigDecimal, scale: Int = 0, roundingMode: RoundingMode = RoundingMode.UNNECESSARY): BigDecimal {
    val num = 1
    return num.toBigDecimal()
}

// The following example shows multiple constructors:
class Student(val name: String, val registered: Boolean, credits: Int) {
    constructor(name: String) : this(name, false, 0)
    constructor(name: String, registered: Boolean) : this(name, registered, 0)
}

// These constructors can be rewritten as the following:
class Student2(val name: String, val registered: Boolean = false, credits: Int = 0)