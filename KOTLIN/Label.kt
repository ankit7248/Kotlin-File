fun main() {
    loops@for (i in 1..10) {
        for (j in 1..10) {
            if(i %3 ==0)
            {
                break@loops
                println("$i,$j")
            }
        }
    }
}

    // var animals =  arrayListOf<String>()
    // for (i in 1..5) {
    //     println("please enter ana animal")
    //     val input = readLine()?:""
    //     if(input == "snake")
    //     {
    //         println("sorry we cannot accept snakes")
    //         break
    //     }
    //     animals.add(input)
    //     println("current animals $animals")
    // }

//     var input = readLine() ?: ""
//     var ages = input
//     while (true) {
//         if (input == "stop") {
//             println("stop")
//             break
//         }
//         if (ages.toInt() < 18) {
//             println("client is not allowed.")
//             continue
//         }
//     }
//     println("your warm welcome")
// }
