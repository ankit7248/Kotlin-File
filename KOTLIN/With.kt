// fun main() {
//     with(car6()) {  speed = 80 
//          drive() 
//           println("car is driving") }
// }

// class car6{
// var speed = 50
// fun drive()
// {
//     println("driving at $speed")

// }
// }

fun main() {
    with(person()) { firstname = "ankit" 
    lastname = "kumar"
    age = 20
    allinfo() }
}

class person
{
    var firstname :String = ""
    var lastname :String = ""
    var age :Int = 0

    fun allinfo()
    {
        println("$firstname $lastname and age : $age")
    }

}