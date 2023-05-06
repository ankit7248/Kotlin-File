fun main() {
    var mymath = math()
    mymath.add()
    mymath.sub()
    mymath.mul()
    mymath.div() 
}

class math
{
    var input = readLine()?:""
    var input1 = readLine()?:""
    var a = input.toInt()
    var b = input1.toInt()

    fun add(){
        println("sum of $a and $b is ${a + b}")
    }
    fun sub(){
        println("sub of $a and $b is ${a - b}")
    }
    fun mul(){
        println("mul of $a and $b is ${a * b}")
    }
    fun div(){
        println("div of $a and $b is ${a % b}")
    }
}

//the object construct 

fun main() {
    databaseaccess.connected = true
    if(databaseaccess.connected)
    {
        databaseaccess.disconnect()
    }
    else{
        databaseaccess.connect()
    }
    println("database is connected: ${databaseaccess.connected}")
}

object databaseaccess{
    var connected = false
    fun connect()
    {
        connected = true
        println("connected to the database")
    }

    fun disconnect()
    {
        connected = false
        println("disconnected to the database")
    }
}
