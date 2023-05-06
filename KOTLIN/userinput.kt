fun main() {
     println("input something")
    val tinput = readLine()
    println("output is : $tinput ")

    println("input something")
    val userinput = readLine() ?: ""
    println("output is : ${userinput.toInt()}")

    println("input something")
    val input = readLine() ?: ""
    println("output is : ${input.toInt()}")

    println("${userinput.toInt() + input.toInt() } ")

    var pi = 3
    println(pi::class.java)

    var pier: Byte = 5
    println(pier:: class.java)

    var pierty = 34L
    println(pierty:: class.java) 

    var piertys = 34F
    println(piertys:: class.java) 

    var piery: Long = 5
    println(piery:: class.java) 

    var pierys: Int = 5
    println(pierys:: class.java)
    
    println("${piery + pierys} ")


    


    // var vi = readLine()?:""
    // println("int is : ${vi.toInt()}")
    // println("${vi.toInt() * pi.toDouble()}")

}
