fun main() {
    val n = readLine()!!.toInt()
    var maxValue = Int.MIN_VALUE

    repeat(n) {
        val input = readLine()!!.toInt()
        if (input % 4 == 0 && input > maxValue) maxValue = input
    }
    println(maxValue)
}