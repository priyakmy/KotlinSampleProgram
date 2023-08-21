fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = numbers.map { it * it }
    println(squaredNumbers) // Prints: [1, 4, 9, 16, 25]

    val sum = { a: Int, b: Int -> a + b }
    println("Sum of two number:" + sum(3, 5)) // Prints: 8

}