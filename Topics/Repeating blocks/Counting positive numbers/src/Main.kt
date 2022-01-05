fun main() {
    val n = readLine()!!.toInt()
    var positive = 0

    repeat(n) {
        val number = readLine()!!.toInt()
        if (number > 0) positive++
    }
    println("$positive")
}