import java.util.*

fun main() {
    println("Enter an alphabet:")
    val input = readLine()

    if (input != null && input.length == 1 && input[0].isLetter()) {
        val alphabet = input.lowercase(Locale.getDefault())[0]
        when (alphabet) {
            'a', 'e', 'i', 'o', 'u' -> println("$alphabet is a vowel")
            else -> println("$alphabet is a consonant")
        }
    } else {
        println("Invalid input! Please enter a single alphabet.")
    }
}
