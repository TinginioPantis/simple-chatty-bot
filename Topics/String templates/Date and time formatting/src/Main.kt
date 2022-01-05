import java.util.*

fun main() {
//    val scanner = Scanner(System.`in`)
//    val hours = scanner.nextInt()
//    val minutes = scanner.nextInt()
//    val seconds = scanner.nextInt()
//    val day = scanner.nextInt()
//    val month = scanner.nextInt()
//    val year = scanner.nextInt()

    val (hours, minutes, seconds) = readLine()!!.split(" ")
    val (day, month, year) = readLine()!!.split(' ')

    println("$hours:$minutes:$seconds $day/$month/$year")
}