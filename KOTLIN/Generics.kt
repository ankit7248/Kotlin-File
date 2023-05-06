// fun main() {
//     var mybox = box<String>()
//     mybox.display("hello")

//     val newBox = newbox<Int ,Float>()
//     newBox.display(4, 8.3F)
// }

// //<T> is generic in T you put anything in character working is same

// class box<T>
// {
//     fun display(item : T)
//     {
//         println(item)
//     }
// }

// class newbox<s ,u>
// {
//     fun display(yes :s ,yes1 :u)
//     {
//         println(yes)
//         println(yes1)
//     }
// }

// genric type parameter

fun main() {
    var Chef1 =chef<APPLE>()
    Chef1.cook(APPLE())
}

abstract class Fruit {
    abstract fun peel()
}

class APPLE : Fruit() {
    override fun peel() {
        println("peeling the APPLE")
    }
}

class chef<t : Fruit> {
    fun cook(item: t) {
        item.peel()
    }
}
