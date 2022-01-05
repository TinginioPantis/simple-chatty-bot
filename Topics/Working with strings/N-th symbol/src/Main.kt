fun main() {
    val input = readLine()!!
    val n = readLine()!!.toInt()
    println("Symbol # $n of the string \"$input\" is '${input[n - 1]}'")
}