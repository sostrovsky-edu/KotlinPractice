package unit_testing.test_package

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// #2
class RepositoryTest {
    /*private val mongo: GenericContainer
    private val repo: Repository

    init {
        mongo = startMongoContainer().apply {
            configure()
        }

        repo = Repository(mongo.host, mongo.port)
    }

    @Test
    fun `test1` ()*/
}

/*
#1
class RepositoryTest {
    private val mongo = startMongoContainer().apply {
        configure()
    }

    private val repo = Repository(mongo.host, mongo.port)

    @Test
    fun test1()
}*/
