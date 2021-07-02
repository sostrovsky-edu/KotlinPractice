package interfaces.example2

import java.util.logging.Logger

fun main() {
    val human = Human()
    human.beforeExecute()
    human.execute()
    human.afterExecute()
}

class Human : LoggingExecutable {
    override fun execute(): Int {
        log.info("Executing: $this")
        return 0
    }
}

interface Executable {
    fun execute(): Int

    fun beforeExecute() {}
    fun afterExecute() {}
}

// всем кто будет реализовывать этот интерфейс в поле "log" будет предоставлен реальный класс Logger
interface Loggable {
    val log: Logger
        get() = Logger.getLogger(javaClass.name)
}

interface LoggingExecutable: Executable, Loggable {
    override fun beforeExecute() {
        log.info("Before executing: $this")
    }

    override fun afterExecute() {
        log.info("After executing: $this")
    }
}
