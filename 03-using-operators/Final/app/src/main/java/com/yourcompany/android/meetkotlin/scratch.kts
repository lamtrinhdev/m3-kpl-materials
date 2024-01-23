val sum = 3+2
println(sum)

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

val result = 6 / 2
println(result)

val remainder = 11 % 2
println(remainder)


val age = 14
if (age < 16) {
    println("You cant drive")
} else {
    println("You can drive")
}

val a = 10
val b = 20
val c = 30

if (a > b && a > c) {
    println("a is the largest number.")
} else {
    println("a is not the largest number.")
}

if (a > b || a > c) {
    println("a is larger than b or c.")
} else {
    println("a is not larger than b or c.")
}

val isALargest = a > b && a > c
println("It is ${isALargest} that a is the largest number")

val hello: String? = null
println(hello?.length)

val message = hello ?: "value is null"
println(message)