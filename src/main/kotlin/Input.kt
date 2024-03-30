fun main() {
   println("Enter your name:")
    val name:String = readLine()!!.toString()
    println("Enter your Age:")
    val age = readLine()!!.toInt()
    println("Enter your GPA:")
    val GPA = readLine()!!.toDouble()
    println("==== User Information =====")
    println("YOur name is: $name")
    println("Your age is: $age")
    println("Your GPA is: $GPA")

    val numer1= 30
    val number2 = 50
    val result =number2 -numer1
    print("Diffrence of both number is: $result")

    println((3+10)*2)
}