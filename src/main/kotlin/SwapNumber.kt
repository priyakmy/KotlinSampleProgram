
//Without Using Third Variable

fun main(){

    var first = 12.0f
    var second = 24.5f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    first = first - second
    second = first + second
    first = second - first

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")



    // Using Third Variable

    println("Enter your First number:")
    var p= readLine()!!.toInt()
    println("Enter your Second number:")
    var q= readLine()!!.toInt()

    val temp = p
         p= q
         q= temp

    println("Swaped number is: $p, $q")






}