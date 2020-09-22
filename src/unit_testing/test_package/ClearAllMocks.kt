package unit_testing.test_package

import io.mockk.clearAllMocks
import io.mockk.mockk
import org.junit.jupiter.api.BeforeEach

// #1
/*class DesignControllerTest {
    private lateinit var repo: DesignRepository
    private lateinit var client: DesignClient
    private lateinit var controller: DesignController

    // Will slow down tests and increase time mocking for each test
    @BeforeEach
    fun init() {
        repo = mockk()
        client = mockk()
        controller = DesignController(repo, client)
    }
}*/

// #2
/*
class DesignControllerTest {
    private val repo = mockk()
    private val client = mockk()
    private val controller = DesignController(repo, client)

    // That's good!
    @BeforeEach
    fun init() {
        clearAllMocks(repo, client)
    }
}*/
