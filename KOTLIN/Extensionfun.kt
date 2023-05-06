// extension function

// fun main() {
//     val name  = "ankit"
//     println(name.slim())
// }

// fun String.slim() = this.substring(1,length-1)


// extension properties

// fun main()
// {
//   println("some thing".getcustomname())
//   println(3.getcustomname())
// }

// fun String.getcustomname() ="a string of character"

// fun Int.getcustomname() ="a integer  number"

//Companion object extension

fun main() {
    book.printme()
}

class book{
    companion object
}

fun book.Companion.printme()
{
println("car companion object")
}