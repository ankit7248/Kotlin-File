fun main() {
    // for (i in 0..3) {
    //     say()
    // }
    // var j = 5
    // do{
    //     j--
    //     aplhabet()
    // }while (j > 0)

    // double( number : 5)
    // for (i :Int in 0..3) {
    //     double(i)
    // }
    listaniamls()
}
//     double1(5, "5*2 =")
// }
// fun say()
// {
//     println("hello everyone")
// }

// fun aplhabet()
// {
//     println("a,b,c,d,e,f,g")
// }

// //function parameter

// fun double1(number: Int , message:String = "double is")
// {
//     println("$message ${number *2}")
// }

// fun double(number: Int)
// {
//     println("double ${number} is ${number * 2}")
// }

// local function

fun listaniamls() {
    fun listoneanimal(animal: String) {
        println("i have a $animal")
    }
    val myanimals = arrayListOf("cat", "dog", "cow", "horse")
    for (animal in myanimals) {
        listoneanimal(animal)
    }
}
