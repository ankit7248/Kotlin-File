// fun main() {
//     println(multiply(5))
//     println(multiply(5, 4))

//     sayhello("rohan")
//     sayhello(listOf("anna", "bob", "carol"))

//     feedanimal("cat")
//     feedanimal(setOf("dog", "bear", "shark"))
// }

// fun multiply(number: Int) = number * 2

// fun multiply(number: Int, multiplier: Int) = number * multiplier

// fun sayhello(person: String) {
//     println("hii $person")
// }

// fun sayhello(people: Collection<String>) {
//     for (person in people) {
//         println("hii $person")
//     }
// }

// fun feedanimal(animal: String) {
//     println("feeding the $animal")
// }

// fun feedanimal(animals: Collection<String>) {
//     for (animal in animals) {
//         feedanimal(animal)
//     }
// }

fun main() {
    var item = mom1()
    item.say()
    item.say("sh")
    item.say("fr")
    item.say("gr")
    item.say("dre")
    item.say("hello bachua",200)
}
class mom1()
{
    //  fun say(message: String)
    //  {
    //     println("mom says $message")
    //  }

     fun say()  //default constructor
     {
        println("mom says hii")
     }
     fun say(message: String ,time :Int)  // parametrized constructor
     {
        var i =0
        while(i < 5)
        {
            println("$message and $time bachua")
            i++
        }
        
     }

     fun say (language: String)
     {
        when (language)
        {
            "fr" -> println("hello bro") 
            "sh" -> println("hello bro ,where are you from?") 
            "gr" -> println("hello bro , how are you?") 
            else -> println("english is also important anywhere in world")
        }
     }
}

