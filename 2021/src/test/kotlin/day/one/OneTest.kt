package day.one

import org.junit.jupiter.api.Test

internal class OneTest {
    @Test
    internal fun `should return a welcome message`() {
        val result = One().start()

        assertThat(result).isEqualTo("Welcome to the Advent of Code 2021!")
    }
}
