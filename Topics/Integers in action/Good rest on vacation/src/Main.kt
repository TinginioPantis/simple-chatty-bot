fun main() {
    val vacationDays = readLine()!!.toInt()
    val foodCost = readLine()!!.toInt()
    val oneWayFlightCost = readLine()!!.toInt()
    val oneNightHotelCost = readLine()!!.toInt()
    val totalVacationCost = (vacationDays * foodCost) + (oneWayFlightCost * 2) + ((vacationDays-1) * oneNightHotelCost)
    println(totalVacationCost)
}