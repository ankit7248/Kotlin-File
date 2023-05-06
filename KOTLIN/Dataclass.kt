// fun main() {
//     val myuser = user("john", "john@gamil.com", "6383")
//     val myuser1 = user("john", "john@gamil.com", "6383")
//     println(myuser == myuser1)

//     // output is true in data classes

// }

// data class user(val name: String, val email: String, val pass: String)

// fun main() {
//     val myuser = user("john","john@gamil.com","6383")
//     val myuser1 = user("john","john@gamil.com","6383")
//     println(myuser == myuser1)

//     //output is false in  classes

// }

// class user{
//     val name: String,
//     val email: String,
//     val pass:String
// }

//copy data in other variable

fun main() {
    val myuser = user("john", "john@gamil.com", "6383")
    val myuser1 = user("john", "john@gamil.com", "6383")
    println(myuser == myuser1)

    val myuser3: user = myuser1.copy(email ="john@gmail.com")
    println(myuser3)

    // output is true in data classes

}

data class user(val name: String, val email: String, val pass: String)
