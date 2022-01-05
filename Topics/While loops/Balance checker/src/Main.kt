import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val initialBalance = scanner.nextInt()

    var currentBalance = initialBalance
    var allPurchasesSucceeded = true

    while (scanner.hasNextInt()) {
        val purchaseAmount = scanner.nextInt()
        if (purchaseAmount <= currentBalance) {
            currentBalance -= purchaseAmount
        } else {
            allPurchasesSucceeded = false
            println(
                    "Error, insufficient funds for the purchase. Your balance is $currentBalance, but you " +
                    "need $purchaseAmount."
            )
        }
    }

    if (allPurchasesSucceeded) {
        println("Thank you for choosing us to manage your account! Your balance is $currentBalance.")
    }
}