fun main(){

    val car= Automobile( "car" ,4,    5)
        println(car.name)
        println(car.tyres)
        println(car.maxseating)
    val car2= Automobile("Car2","Petrol")
    println(car2.name)
    println(car2.tyres)
    println(car2.maxseating)


}
class Automobile(val name:String,val tyres:Int , val maxseating:Int){ // Primary Constructor

    init {
        println(" $name is created")
    }
    init {
        println(" 2nd Initializer Block")
    }

    constructor(nameParam: String, engineParam: String) : this(nameParam, 4, 5) {
        println("Secondary constructor is called")
    }
    fun drive(){}

    fun applybreak(){}

}
