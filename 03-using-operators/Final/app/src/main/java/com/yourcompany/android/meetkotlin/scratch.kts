val sum = 3+2
println(sum)

val difference = 10 - 2
println(difference)

val product = 3 * 3
println(product)

val quotient = 6 / 2
println(quotient)

val remainder = 11 % 2
println(remainder)


var count = 5
count += 1
println(count)
count -=3
println(count)
count *= 2
println(count)
count /= 2
println(count)

count ++
println(count)
count--
println(count)

val age = 14
if (age < 16) {
    println("You cant drive")
} else {
    println("You can drive")
}

val a = 10
val b = 20
val c = 30

val isALargest = a > b && a > c
println("It is ${isALargest} that a is the largest number")


val raining = true
val temperature = 35

val carryUmbrella = raining || temperature > 30
println("Carry an umbrella: $carryUmbrella")

val isTrue = true
println(!isTrue)

val hello: String? = null
println(hello?.length)

val message = hello ?: "value is null"
println(message)