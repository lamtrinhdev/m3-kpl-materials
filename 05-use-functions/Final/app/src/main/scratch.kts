val count = 4

fun playBabyShark(count: Int) {
    for (i in 1..count) {
        println("Baby Shark, doo-doo, doo-doo, doo-doo")
    }
    println("Baby shark")
}

playBabyShark(3)

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

val coins = 115
val snack = "Soda"
println(attemptToDispenseSnack(coins, snack))
