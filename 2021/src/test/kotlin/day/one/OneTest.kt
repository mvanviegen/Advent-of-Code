package day.one

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class OneTest {
    private val dayOneInput = this::class.java.getResource("/dayoneinput.txt")

    @Test
    internal fun `should return 7 given a list with 7 increments`() {
        val input = listOf(199,200,208,210,200,207,240,269,260,263)
        val result = One().measureIncrements(input)

        assertThat(result).isEqualTo(7)
    }

    @Test
    internal fun `should return the amount of increments of a given list`() {
        // Blabla valideer iets uit dayOneInput var
    }
}
