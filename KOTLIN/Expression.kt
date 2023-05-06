fun main() {
    // var favouritepet = "mice"
    // var availablepet = listOf("dog","cat","sheep")
    // if(favouritepet in availablepet)
    // {
    //     println("we have your next best friend")
    // }
    // else
    // {
    //     println("sorry, ${favouritepet} is not available")
    // }

    //!In keyword

    // var coffee = "mocha"
    // var availablecoffee = listOf("mocha","capuccino")
    // if(coffee !in availablecoffee)
    // {
    //     println("not available")
    // }
    // else
    // {
    //     println("sorry, ${coffee} is available")
    // }

    // Range 

    var input = readLine()?:""
    var number = input.toInt()
    if(number !in 0..9)
    {
    println("your number is not single digit")
    }
    else{
        println("your number is single digit")
    }
}