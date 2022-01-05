fun main() {
    val input = readLine()!!.toInt()

    var number = input
    while (number != 1) {
        print("$number ")
        number = if (number % 2 == 0) number / 2 else number * 3 + 1
    }
    print("$number ")
}