// fun main() {
//     val mycar = car()    // create object
//     val yourcar = car()

//     mycar.model = "bmw"
//     yourcar.model = "toyota"

//     mycar.start()
//     mycar.drive(34)

//     yourcar.start()
//     yourcar.drive(984)
// }

// class car {
//     var model: String? = null
//     var topspeed = 100

//     fun start() {
//         println("starting the $model")
//     }
//     fun drive(speed: Int) {
//         println("driving at a speed to $speed")
//     }
// }

// fun main() {
//     var mycar = garage()
//     mycar.car1.drive()
// }

// class car {
//     fun drive() {
//         println("drive")
//     }
// }

// class garage {
//     val car1 = car()
// }

open class chunnu {

    fun breed() {
        println("enter the user name")
    }
}

class animal : chunnu() {
    fun cat() {
        println("enter the name")
    }
}

fun main() {
    var object2 = chunnu()
    object2.breed()
    var obkject = ankit()
    

}
fun ankit{
    print("ankit")
}