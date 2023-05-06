fun main() {
    var myoven:oven = bosch()
    myoven.cook(34)
    myoven.turnoff()
    myoven.turnOn()
}
interface oven{
    val temps :Int

    fun turnoff()
    fun turnOn()
    fun cook(temps:Int)
    {
        println("cooking temp is $temps")
    }
}

class bosch: oven
{
    override val temps = 180

    override fun turnoff()
    {
        println("turning off")
    }
    override fun turnOn()
    {
        println("turning On")
    }
}

// fun main() {
//     val factory = carfactory()
//     val mycar:car5 = factory.providecar()

//     mycar.speed = 90
//     mycar.park()
//     mycar.drive()
// }

// interface car5 {
//     var speed: Int

//     fun drive()
//     fun park()
// }

// class BMW: car5 {
//     override var speed: Int = 234
//     override fun drive() {
//         println("car $speed")
//     }
//     override fun park() {
//         println("bmw parking")
//     }
// }

// class carfactory
// {
//   fun providecar():car5
//   {
//     return BMW()
//   }
// }


// Multiple interfaces
fun main() {
}

interface pet {
    var cutenesslevel: Int 
    fun startpalying()
    fun feed()
}

class puppy : pet {
    override var cutenesslevel = 10
    override fun startpalying() {
        println("running,jumping")
    }
    override fun feed(){
        println("give doggy treats")
    }
}

class child {
    var mypet: pet = puppy()
    fun raisepet() {
        for(i: Int in 1..mypet.cutenesslevel)
        {
        mypet.startpalying()
        }
        mypet.feed()
    }

}

class petstore{
    fun getpet(): pet{
        return puppy()
    }
}
