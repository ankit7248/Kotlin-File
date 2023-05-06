fun main() {
    var animal = "dog"
    var action: String  = when(animal)
    {
        "cat" ->
        {
            "pet it"
        }
        "dog" ->
        {
            "feed it"
        }
        else ->
        {
            "google it"
        }
    }
    println("when you meet a $animal you should $action")

    // var num = 24
    // var action: String =""
    // when(num % 2)
    // {
    //     0 -> action = "number is even"
    //     1 -> action =  "number is odd"
    // }
    // println(action) 

    // val month = "oct"
    // var action = when(month)
    // {
    //      "jan","mar","may" -> 31
    //      "feb" -> 28
    //      else -> 30
    // }
    // println("$action")

    // caputuring the subject

    // val name : String = "michelle IS A GOOD BOY"
    // var length = name.length
    // when (length)
    // {
    //     in 1..5 -> println("a name with $length characters is short")
    //     in 6..10 -> println("a name with $length characters is medium")
    //     else -> println("a name with $length characters is long")
    // }

    var input = readLine()?:""
    var hour =  input.toInt()
    if(hour > 23) hour = 23
    var time = when(hour)
    {
        in 6..11 -> println("morning")
        in 12..14 -> println("noon")
        in 15..17 -> println("afternoon")
        in 18..21 -> println("evening")
        else -> println("night")
    }
    println("${hour} it's ${time}")
}