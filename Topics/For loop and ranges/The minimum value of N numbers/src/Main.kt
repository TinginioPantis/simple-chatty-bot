fun main() {
    val n = readLine()!!.toInt()
    var minValue = Int.MAX_VALUE
    repeat(n) {
        val number = readLine()!!.toInt()
        for (i in number..minValue)
            if (number < minValue) minValue = number
    }
    println(minValue)
}