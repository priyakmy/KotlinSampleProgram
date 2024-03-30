fun main() {
    println("Enter three numbers:")
    val num1 = readLine()!!.toDouble()
    val num2 = readLine()!!.toDouble()
    val num3 = readLine()!!.toDouble()

    val largest = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    println("The largest number among $num1, $num2, and $num3 is $largest")
}
