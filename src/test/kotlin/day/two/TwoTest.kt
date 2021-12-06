package day.two

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Ignore
import org.junit.jupiter.api.Test

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

    @Ignore
    @Test
    internal fun `should calculate the multiplied horizontal and depth position given multiple positions`() {
        TODO("Not yet implemented")
    }
}
