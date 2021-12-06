package day.two

class Movement(val direction: Enum<Direction>, count: Int) {
    val count = if (direction === Direction.UP) -count else count
}
