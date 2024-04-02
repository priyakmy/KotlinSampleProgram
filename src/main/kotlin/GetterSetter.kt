import java.util.*

fun main(){
val p= Test("priya",26)
    println(p.name)
    println(p.age)
    p.age= -16

}
class Test(nameParam:String,ageParam:Int ){
    var name :String =nameParam
        get() {
            println("Name Getter is called:")
            return field.uppercase(Locale.getDefault())
        }
    var age:Int =ageParam
        set(value) {
            if(value>0){
                field=value

            }
            else{
                println("Age Can't be negative")
            }
        }


}