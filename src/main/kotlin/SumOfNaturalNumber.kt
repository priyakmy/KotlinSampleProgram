
fun main() {
    println("Enter a positive integer:")
    val n = readLine()!!.toInt()

    var sum = 0
    for (i in 1..n) {
        sum += i
    }

    println("The sum of natural numbers from 1 to $n is $sum")
}

