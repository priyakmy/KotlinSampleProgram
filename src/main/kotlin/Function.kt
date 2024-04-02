fun main(){
  val result=sum(10,20)
    println(result)

    evenOdd(4)
}
fun sum(a:Int , b:Int):Int
{
    val add=a+b

    return add
}

fun evenOdd(p:Int) {

    if (p % 2 == 0) {
        print("Even number")
    } else {
        print("Odd number")
    }
}


