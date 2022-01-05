// import java.util.stream.Stream
// import kotlin.streams.toList

fun main() {
    val n = readLine()!!.toInt()

//    // Functional approach:
//
//    // n=1, stream=[1, 1, 1, 1, 1, 1, 1, 1...], result=[1]
//    // n=2, stream=[2, 2, 2, 2, 2, 2, 2, 2...], result=[2, 2]
//    // n=3, stream=[3, 3, 3, 3, 3, 3, 3, 3...], result=[3, 3, 3]
//    fun smallSequence(n: Int): Stream<Int> = Stream.generate { n }.limit(n.toLong())
//
//    // n=3, result=[1, 2, 2, 3, 3, 3]
//    fun sequence(n: Int): List<Int> = (1..n).flatMap { smallSequence(it).toList() }
//
//    val numbers = sequence(n).stream().limit(n.toLong())
//    for (number in numbers) print("$number ")

    // Imperative approach:
    var numbersPrinted = 0
    var currentNumber = 1

    while (numbersPrinted < n) {
        var currentNumbersPrinted = 0

        while (numbersPrinted < n && currentNumbersPrinted < currentNumber) {
            print("$currentNumber ")
            currentNumbersPrinted++
            numbersPrinted++
        }

        currentNumber++
    }
}