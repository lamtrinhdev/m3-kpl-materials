
var lyric = "Haters gonna"

for (i in 1..5) {
    lyric += " hate"
}

println(lyric)


var counter = 10
while (counter >= 0) {
    println("T-$counter")
    counter--
}

println("We have lift off \uD83D\uDE80")

counter = 10
do {
    println("T-$counter")
    counter--
} while (counter >= 0)
println("We have lift off \uD83D\uDE80")


val age = 1

if (age < 12 ) {
    println("You can't vote")
} else if (age < 18) {
    println("You can vote soon")
} else {
    print("You can vote")
}

println("Welcome to Kotlin Snack Corner!")
println("Please select an item by entering the number:")
println("1. Burger\n2. Pizza\n3. Sandwich\n4. Fries")

val choice = 4

val preparationTime = when (choice) {
    1 -> "Burger will take 10 minutes to prepare."
    2 -> "Pizza will take 15 minutes to prepare."
    3 -> "Sandwich will take 5 minutes to prepare."
    4 -> "Fries will take 7 minutes to prepare."
    else -> "Sorry, we don't have that item on our menu."
}

println(preparationTime)