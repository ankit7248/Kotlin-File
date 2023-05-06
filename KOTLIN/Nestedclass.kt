fun main() {
    val mycar = car8()
    mycar.drive()
}
open class car8{
    private val Engine = engine()
    var speed = 100
    fun drive()
    {
        Engine.run()
        println("driving at $speed")
    }
// we hide engine in private 
    public inner class engine  
    {
        val rpm = 300
        
        fun run()
        {
            println("engine runnning rpm :$rpm")
            this@car8.speed = 150
            println("engine runnning")
        }
    }
}