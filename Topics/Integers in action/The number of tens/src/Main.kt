fun main() {
    // subtract the last digit from the total and take modulus 100 divided by ten
    val number = readLine()!!.toInt()
    val numberOfTens = ( number / 10 ) % 10
    println(numberOfTens)
}