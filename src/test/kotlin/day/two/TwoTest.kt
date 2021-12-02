package day.two

import kotlin.test.Ignore
import org.junit.jupiter.api.Test

internal class TwoTest {
    @Test
    internal fun `should return 150 given the example input`() {
        val positions = listOf("forward", "5", "down", "5")
        val result = Two().calculateMultipliedSumOfPosition(positions)
    }

    @Ignore
    @Test
    internal fun `should calculate the multiplied horizontal and depth position given multiple positions`() {
        TODO("Not yet implemented")
    }
}
