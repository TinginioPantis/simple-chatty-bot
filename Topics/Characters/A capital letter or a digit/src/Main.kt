fun main() {
    val ch1 = readLine()!!.first()
    val ch1IsDigit = ch1.isDigit()
    val ch1IsZero = ch1 == '0'
    val ch1isCapitalLetter = ch1.isUpperCase()
    println(ch1IsDigit && !ch1IsZero || ch1isCapitalLetter)
}