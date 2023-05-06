// fun main() {
//     car7().apply {
//                 speed = 80
//                 color = "red"
//                 startcar()
//             }
//             println(car7())
// }

// class car7 {
//     var speed = 0
//     var color: String = ""
//     fun startcar() {
//         println("speed $speed and color $color")
//     }
// }

fun main() {

    car7().apply {
        speed = 80
        color = "red"
        startcar()
    }

    // .also { println("car is running")
    //      println("car is running in road")
    //  }

}

class car7 {
    var speed = 0
    var color: String = ""
    fun startcar() {
        println("speed $speed and color $color")
    }
}
