package day.three

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

internal class ThreeTest {
    @Test
    internal fun `should return a diagnostic report based on test input`() {
        val input = listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010"
        )

        val result = Three().diagnostic(input)
        assertThat(result).isEqualTo(198)
    }

    @Test
    internal fun `should return a diagnostic report based on day three input`() {
        val input = generateListOfInput()

        val result = Three().diagnostic(input)
        assertThat(result).isEqualTo(3959450)
    }


    private fun generateListOfInput(): List<String> {
        val file = this::class.java.getResource("/daythreeinput.txt").openStream().bufferedReader()
        val inputList = mutableListOf<String>()
        for (line in file.readLines()) {
            inputList.add(line)
        }
        return inputList.toList()
    }
}
