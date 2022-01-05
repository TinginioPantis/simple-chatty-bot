fun main() {
    var sum = 0
    do {
        val number = readLine()!!.toInt()
        sum += number
    } while (number != 0)
    println(sum)
}