fun main() {
    val number = readLine()!!.toInt()

//    val nextEvenNumber = if (number % 2 == 0) number + 2 else number + 1
//
//    val nextEvenNumber1 = if (number % 2 == 0) number + 2 - 0 else number + 2 - 1
//
//    val nextEvenNumber2 = number + 2 - (if (number % 2 == 0) 0 else 1)

    val nextEvenNumber3 = number + 2 - (number % 2)
    println(nextEvenNumber3)
}