fun main() {

    // val mycar = car1("bmw", 220)
    // println(mycar.model)
    // println(mycar.topspeed)
    val mycar = car2()
    val yourcar = car2("bmw") 
    val thiscar = car2("mahindra",240) 
    
    println("model ${mycar.model} and speed ${mycar.topsepeed}")
    println(yourcar.model)
    println(yourcar.topsepeed)
    println(thiscar.model)
    println(thiscar.topsepeed)
        
}

//class car1(var model: String, var topspeed: Int) {}
class car2{
    constructor()
    {
        model = "no model"
        topsepeed = 150
    }
    constructor(newmodel:String)
    {
        model = newmodel
        topsepeed = 200
    }
    constructor(newmodel:String,topspeed:Int)
    {
        model = newmodel
        topsepeed = topspeed
    }
    var model: String? = null
    var topsepeed = 100
}

// fun main() {
//    val item =  useraccount()
//    item.constructer1()
// }
// class useraccount
// {
//     constructer1()
//     {
//          username = "generic"
//          balance = 0
//     }

//     constructer1(newusername: String)
//     {
//         username  = newusername
//         balance = 0
//     }
//     constructer1(newusername: String, newbalance :Int)
//     {
//         username  = newusername
//         balance = newbalance
//     }



//     var username : String? = null
//     var balance : Int = 7823
    
// }