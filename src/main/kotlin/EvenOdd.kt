
fun main() {
        println("Enter a number:")
        val input = readLine()?.toIntOrNull()
        if (input != null) {
            val result = if (input % 2 == 0) "even" else "odd"
            println("The number is $result.")
        } else {
            println("Invalid input. Please enter a valid number.")
        }
    }
