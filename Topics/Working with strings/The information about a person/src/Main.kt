fun main() {
    val person = readLine()!!.split(" ")
    val name = person[0]
    val surname = person[1]
    val age = person[2]

    val firstLetterName = name[0]
    println("$firstLetterName. $surname, $age years old")

}