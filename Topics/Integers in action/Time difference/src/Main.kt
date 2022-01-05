fun main() {
    val time1 = readTime()
    val time2 = readTime()
    val difference = time2 - time1
    println(difference)
}

fun readTime(): Int {
    val h = readLine()!!.toInt()
    val m = readLine()!!.toInt()
    val s = readLine()!!.toInt()
    return h * 60 * 60 + m * 60 + s
}