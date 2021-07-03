package data.type.classes.type.inner_class.example3

import java.lang.reflect.Executable
import java.util.concurrent.Callable
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future

class SqlRunner {
    val pool : ExecutorService = Executors.newCachedThreadPool()

    fun run(exec: Executable): Int {
        return WorkItem(exec).call()
    }

    fun runAsync(exec: Executable): Future<Int> {
        return pool.submit(WorkItem(exec))
    }

    open class WorkItem(val exec: Executable) : Callable<Int> {
        override fun call(): Int {
            // exec.beforeExecute()
            // val res = exec.execute()
            // exec.afterExecute()
            // return res
            return 0
        }
    }

    // будет иметь ссылку на класс SqlRunner
    inner class AsyncWorkItem(exec: Executable) : WorkItem(exec) {
        fun submit(): Future<Int> = this@SqlRunner.pool.submit(this)
    }
}