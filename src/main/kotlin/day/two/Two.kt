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
            .let(::sumDirections)
            .calculateEndingPosition()

    fun calculateFinalPosition(movements: List<Movement>): Any {
        var aim = 0
        var forward = 0
        var depth = 0
        (startingPositions + movements)
            .forEach {
                when (it.direction) {
                    FORWARD -> {
                        forward += it.count
                        depth += it.count * aim
                    }
                    else -> aim += it.count
                }
            }
        return forward * depth
    }

    private fun sumDirections(movements: List<Movement>) =
        movements
            .let(::movementsByDirection)
            .sumDirections()

    private fun movementsByDirection(movements: List<Movement>) =
        movements.groupBy { it.direction }

    private fun Map<Enum<Direction>, List<Movement>>.sumDirections() =
        this.mapValues {
            it.value.sumOf { movement -> movement.count }
        }

    private fun Map<Enum<Direction>, Int>.calculateEndingPosition() =
        get(FORWARD)!! * (get(DOWN)!! + get(UP)!!)
}
