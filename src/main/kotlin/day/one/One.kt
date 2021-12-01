package day.one

class One {
    fun start() = "Welcome to the Advent of Code 2021!"
    fun measureIncrements(input: List<Int>): Int {
        var lastIncrement = 0
        var lastItem = input.first()

        input.forEach {
            if (it > lastItem) {
                lastIncrement++
            }

            lastItem = it
        }

        return lastIncrement
    }
}
