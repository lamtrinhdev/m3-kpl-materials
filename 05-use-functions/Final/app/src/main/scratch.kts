fun playBabyShark(count: Int = 3, shark: String = "Baby") {
    for (i in 1..count) {
        println("$shark Shark, doo-doo, doo-doo, doo-doo")
    }
    println("$shark shark")
}

playBabyShark()
playBabyShark(shark = "Mommy")

// Get the cost of the snack based on its name
fun getSnackCost(snack: String): Int {
    return when (snack) {
        "Chips" -> 45
        "Chocolate" -> 60
        "Cookie" -> 30
        "Soda" -> 50
        else -> 0 // Snack not available
    }
}

// Attempt to dispense the selected snack
fun attemptToDispenseSnack(coins: Int, snack: String): String {
    val cost = getSnackCost(snack)
    return if (coins >= cost) {
        "Dispensing $snack. Enjoy your snack!"
    } else {
        "Not enough coins inserted. $snack costs $cost cents."
    }
}

println(attemptToDispenseSnack(coins = 115, snack = "Soda"))
println(attemptToDispenseSnack(coins = 15, snack = "Chips"))
