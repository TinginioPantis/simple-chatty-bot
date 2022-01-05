fun main() {
    // nuskaityti skaiciu
    val limit = readLine()!!.toInt()
    // atspausdinti skaicius kvadratu iki kol nevirsys nuskaityto skaiciaus
    var currentNumber = 1

//    fun countSquare(n: Int): Int = n * n
//    fun shouldPrintNumber(n: Int): Boolean = countSquare(n) <= limit
//    while (shouldPrintNumber(currentNumber)) {
//        val square = countSquare(currentNumber)
//        println(square)
//        currentNumber++
//    }
    while (currentNumber * currentNumber <= limit) {
        val square = currentNumber * currentNumber
        println(square)
        currentNumber++
    }

   // fun countSquare(n: Int): Int = n * n
  //  fun shouldPrintNumber(n: Int): Boolean = countSquare(n) <= limit
  //  var currentNumber = 1
  //  while (shouldPrintNumber(3)) {
  //      println(currentNumber)
  //  }
}