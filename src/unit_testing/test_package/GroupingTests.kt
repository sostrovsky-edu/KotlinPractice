package unit_testing.test_package

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DesignControllerTest {
    @Nested
    inner class GetDesign {
        @Test
        fun `all fields are included` () {}

        @Test
        fun `limit parameter` () {}
    }

    @Nested
    inner class DeleteDesign {
        @Test
        fun `design is removed in db` () {}
    }
}