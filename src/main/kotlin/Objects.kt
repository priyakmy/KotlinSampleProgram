fun main(){
// oboject creation
    val cr= Person(name = "Jack", age = 20)
    println(cr.name)
    println(cr.age)

}
class Person(val name: String,var age: Int,){
    fun candrive(){
       print("Yes you can drive")
    }
    fun citizen(){
        print("Indian")
    }
}