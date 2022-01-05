fun main() {
    val skaicius = readLine()!!.toInt()
    val treciasSk = skaicius % 10
    val antrasSk = ((skaicius / 10) % 10 )
    val pirmasSk = skaicius / 100
    println (treciasSk + antrasSk + pirmasSk)
}
