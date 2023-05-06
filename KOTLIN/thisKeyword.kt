// fun main() {
//    var postnotes = postnote()
//    println(postnotes.message)
//    postnotes.updatemessage("hello")
//    println(postnotes.message)
// }

// class postnote()
// {
//     var message :String ="no message"

//     fun updatemessage(message :String)
//     {
//         this.message = message   // this keyword is use for pointing to same variable name
//     }
// }

//Init block

// fun main() {
//     val mycar1 = car3()
// }

// class car3{
//     val model = "bmw"
//     val topspeed = 100

//     init{
//         println("this car is a $model and ha atop speed of $topspeed")
//     }
// }

//Companion object

fun main() {
    println(car4.getdrivinginstructions())
}
class car4{
   companion object{
    fun getdrivinginstructions():String
    {
          return "drive safe !"
    }
   }
}