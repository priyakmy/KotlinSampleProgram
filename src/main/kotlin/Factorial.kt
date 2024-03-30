fun main() {
    println("Enter a non-negative integer:")
    val n = readLine()!!.toInt()

    var factorial = 1
    for (i in 1..n) {
        factorial *= i  // factorial = factorial * i
    }

    println("The factorial of $n is $factorial")
}
