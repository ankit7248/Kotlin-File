fun main() {

    val car = weirdcar()
    car.speed = 100
    println("car name ${car.name}")
    println("car speed ${car.speed}")
}



class weirdcar

{
    var name = ""
    var speed : Int get() = 50
    set(value){
    name = "high speed car $value"
    }
}