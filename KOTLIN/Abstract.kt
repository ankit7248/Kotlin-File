//  fun main() {
//     val Container :container = bottle()
//     println(Container.pour())

//     val container1 = bottle()
//     println(container1.fill())

//  }
//  abstract class container{
//     fun pour()
//     {
//         println("pouring liquid")
//     }
//  }

//  class bottle:container()
//  {
//   fun fill()
//   {
//     println("filling bottle")
//   }
//  }
//  class jug:container()
//  {
//  fun fill1()
//   {
//     println("filling bottle")
//   }
//  }

fun main() {
    val Container: container = bottle()
    println(Container.pour())
    val Container2: container = jug()
    println(Container2.pour())
    var n :String = arrayOf(2,3,1,1,2)

    for (i in )
    val container1 = bottle()
    println(container1.pour())
}

abstract class container {
    abstract fun pour()
}

class bottle : container() {
    override fun pour() {
        println("filling bottle")
    }
}

class jug : container() {
    override fun pour() {
        println("filling jug")
    }
}


