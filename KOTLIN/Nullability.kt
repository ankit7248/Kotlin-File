fun main() {
   
    // var nameis: String? = "aman"  // it will run bro
    // nameis = null
    // var name: String = "lilly"  
    // name = null  // compilation error

    //  println(name)
    //  println(nameis)

    val boss : String? = null 
    println(boss?: "yeh, i am boss")

    val bosss : String = "yeh, i am boss"
    println(bosss)

     var catname: String? = "chonkers"
     println(catname?.length)
     catname =null
     println(catname?.length)

     var a: Int? =10
     println("${a?.plus(3)}")
     println("${a?.minus(3)}")
     println("${a?.times(3)}")
     println(a?.div(3))
     println(a?.rem(3))

     var type: String? = "hello sir kya hal ha"
     println(type?.substring(3,6))

     var date = 29.99
     var goat = readLine()?""
     println(goat?:)
}