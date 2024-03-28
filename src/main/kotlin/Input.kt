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
}