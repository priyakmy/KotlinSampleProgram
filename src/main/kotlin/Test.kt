
    fun main(args: Array<String>) {

        //collection of map
        var name = mapOf<Int,String>(1 to "jack",2 to "nano")
        for (roll in name)
            {
                println("${roll.key} => ${roll.value}")
            }

        //  hasmap  implementation
        var Mymap = hashMapOf<Int,String>()
        Mymap.put(1, "priya")
        Mymap.put(2,  "singh")
        Mymap.put(3,  "chand")
        Mymap.put(4,   "singh")

        Mymap.remove(4)
        Mymap.put(4,"Mohnd")

            for(key in Mymap.keys){
                println("Elements at $key = ${Mymap[key]}")

            }




    }
