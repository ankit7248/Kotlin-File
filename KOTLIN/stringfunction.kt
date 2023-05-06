fun main() {
    val mypet = "crocodile"
    println(mypet.length)

    val myname = "michelle"

    println(myname.capitalize())

    val name = "Michelle"

    println(name.decapitalize())

    val TEXT = "   michelle  is good boy"

    println(TEXT.trim())

    val pos = "michelle is good boy"

    println(pos[3])

    val sub = "michelle is good boy"

    println(sub.substring(3, 6))

    val subm = "michelle is good boy"

    println(subm.substring(3))

    val dogname = "michelle"

    println("My dog's name is $dogname")

    println("I have ${5/2}  cats")

    val catname = "my cat name is \"fluffy\""

    println("cat name length is ${catname.length}") // there is little bit differnce using {}

    val client = "mohan"       

    println("hello $client welocme to store")     // there is little bit differnce not using {}

    val orange =3
    val apple =4

    println("total number is ${orange + apple}")
}
