package day.one

class One {
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

    fun measureSlidingWindowIncrements(input: List<Int>): Int {
        val summedInputList = mutableListOf<Int>()
        List(input.size) { idx ->
            if ( input.getOrNull(idx + 2) !== null ) {
                val summedValue = input.slice(idx..idx+2).sum()
                summedInputList.add(summedValue)
            }
        }

        return measureIncrements(summedInputList.toList())
    }
}
