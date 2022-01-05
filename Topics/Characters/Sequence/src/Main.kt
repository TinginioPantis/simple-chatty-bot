fun main() {
    val ch1 = readLine()!!.first()
    val ch2 = readLine()!!.first()
    val ch3 = readLine()!!.first()
    val isInOrder = ch1 + 1 == ch2 && ch2 + 1 == ch3
    println(isInOrder)

}