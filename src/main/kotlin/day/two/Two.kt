package day.two

import day.two.Direction.DOWN
import day.two.Direction.FORWARD
import day.two.Direction.UP

class Two {
    private val startingPositions = listOf(
        Movement(FORWARD, 0),
        Movement(DOWN, 0),
        Movement(UP, 0)
    )

    fun calculateMultipliedSumOfMovements(movements: List<Movement>) =
        (startingPositions + movements)
            .let(::movementsByDirection)
            .let {
                it.sumDirections()
            }
            .let {
                it.calculateTotalSum()
            }

    private fun movementsByDirection(movements: List<Movement>) =
        movements.groupBy { it.direction }

    private fun Map<Enum<Direction>, List<Movement>>.sumDirections() =
        this.mapValues {
            it.value.sumOf { movement -> movement.count }
        }

    private fun Map<Enum<Direction>, Int>.calculateTotalSum() =
        get(FORWARD)!! * (get(DOWN)!! + get(UP)!!)
}
