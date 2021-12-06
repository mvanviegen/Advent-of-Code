package day.three

class Three {
    fun diagnostic(input: List<String>): Int {
        var gamma = ""
        var epsilon = ""
        input.first()
            .forEachIndexed { index, _ ->
                gamma += occurencesCount(input, index).maxByOrNull { it.value }!!.key
                epsilon += occurencesCount(input, index).minByOrNull { it.value }!!.key
            }

        return convertBinaryToDecimal(gamma.toLong()) * convertBinaryToDecimal(epsilon.toLong())
    }

    private fun occurencesCount(input: List<String>, index: Int) =
        input.map { it[index] }
            .groupingBy { it }
            .eachCount()

    private fun convertBinaryToDecimal(num: Long): Int {
        var num = num
        var decimalNumber = 0
        var i = 0
        var remainder: Long

        while (num.toInt() != 0) {
            remainder = num % 10
            num /= 10
            decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
            ++i
        }
        return decimalNumber
    }
}
