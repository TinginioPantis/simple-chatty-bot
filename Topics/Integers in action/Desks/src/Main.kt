fun main() {
    val group1 = readLine()!!.toInt()
    val group2 = readLine()!!.toInt()
    val group3 = readLine()!!.toInt()
    val desks1 = (group1 / 2) + (group1 % 2)
    val desks2 = (group2 / 2) + (group2 % 2)
    val desks3 = (group3 / 2) + (group3 % 2)
    val allDesks = desks1 + desks2 + desks3
    println(allDesks)

}