package day.two

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test
import java.util.*

internal class TwoTest {
    @Test
    internal fun `should return 150 given the example input`() {
        val positions = listOf(
            Movement(Direction.FORWARD, 5),
            Movement(Direction.DOWN, 5),
            Movement(Direction.FORWARD, 8),
            Movement(Direction.UP, 3),
            Movement(Direction.DOWN, 8),
            Movement(Direction.FORWARD, 2)
        )
        val result = Two().calculateMultipliedSumOfMovements(positions)

        assertThat(result).isEqualTo(150)
    }

    @Test
    internal fun `should calculate the multiplied horizontal and depth position given multiple positions`() {
        val input = generateListOfInput()
        val result = Two().calculateMultipliedSumOfMovements(input)

        assertThat(result).isEqualTo(2322630)
    }

    @Test
    internal fun `should calculate the final position based on aim`() {
        val positions = listOf(
            Movement(Direction.FORWARD, 5),
            Movement(Direction.DOWN, 5),
            Movement(Direction.FORWARD, 8),
            Movement(Direction.UP, 3),
            Movement(Direction.DOWN, 8),
            Movement(Direction.FORWARD, 2)
        )
        val result = Two().calculateFinalPosition(positions)

        assertThat(result).isEqualTo(900)
    }

    @Test
    internal fun `should calculate the final position based on aim given advent input`() {
        val result = Two().calculateFinalPosition(generateListOfInput())

        assertThat(result).isEqualTo(2105273490)
    }

    private fun generateListOfInput(): List<Movement> {
        val file = this::class.java.getResource("/daytwoinput.txt").openStream().bufferedReader()
        val inputList = mutableListOf<Movement>()
        for (line in file.readLines()) {
            val inputLine = line.split(" ")
            inputList.add(Movement(Direction.valueOf(inputLine.first().uppercase(Locale.getDefault())), inputLine.last().toInt()))
        }
        return inputList.toList()
    }
}
