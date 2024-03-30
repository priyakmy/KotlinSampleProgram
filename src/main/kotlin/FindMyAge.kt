

        import java.time.Year

        fun main() {

            println("Enter your birth year:")
            val birthYear = readLine()?.toIntOrNull()

            if (birthYear == null || birthYear < 0) {
                println("Invalid input. Please enter a valid birth year.")
                return
            }

            val currentYear = Year.now().value
            val age = currentYear - birthYear


            println("You are $age years old.")
        }




