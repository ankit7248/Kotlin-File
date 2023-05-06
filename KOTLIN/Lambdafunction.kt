fun main() {

    val name = arrayListOf(2,3,12,1)
    for (i in name) { // i print the element 
        println(i)
    }
   
    
    //Higher order function
    val names : ArrayList<String> = arrayListOf("alice","bob","carol")
 
    sayhello(names,{name :String -> println("hello $name")})
     
    //Common higher order

    // var clients: List<String> = listOf("alice","bob","carol","dan")
    // clients.forEach {println("hello $it")}

    var clients: List<String> = listOf("alice","bob","carol","dan")
    clients.filter { it.length < 5 }
    clients.forEach {println("hello $it")}

    val sizes :List<Int> = clients.map { it.length }
    println(sizes)

    val sorted: List<String> = clients.sortedBy { it.length }
    println(sorted)

    val max:String = clients.maxBy { it.length }  //no Error
    println(max)

    val min:String = clients.minBy { it.length }  //no error
    println(min)


}

fun sayhello (names:ArrayList<String>,dosomething:(String)->Unit)
{
    for(name in names)
    {
        dosomething(name)
    }
}




  
    
