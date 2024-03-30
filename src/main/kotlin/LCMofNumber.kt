import kotlin.math.abs

fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}

fun lcm(a: Int, b: Int): Int {
    return abs(a * b) / gcd(a, b)
}

fun main() {
    println("Enter the first number:")
    val num1 = readLine()!!.toInt()

    println("Enter the second number:")
    val num2 = readLine()!!.toInt()

    val result = lcm(num1, num2)
    println("LCM of $num1 and $num2 is $result")
}
