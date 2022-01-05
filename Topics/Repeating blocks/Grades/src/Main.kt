fun main() {
    val n = readLine()!!.toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(n) {
        when (readLine()!!.toInt()) {
            2 -> d++
            3 -> c++
            4 -> b++
            5 -> a++
        }
    }
    println("$d $c $b $a")
}