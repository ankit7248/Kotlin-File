// takeif

// import kotlin.random.Random
// fun main() {
//     for(i :Int in 1..10){
//     val num = Random.nextInt(100)
//     val evenOrnull :Int? = num.takeIf { it % 2  == 0 }

//     println("even num is $num")
//     //println("even num is $evenOrnull")
//     }
// }

// takeunless

import kotlin.collections.arrayListOf

fun main() {
    // for(i :Int in 1..10){
    // val num = Random.nextInt(100)
    // val oddOrnull :Int? = num.takeUnless { it % 2  == 0 }

    // println("odd num is $num")
    // //println("even num is $evenOrnull")
    // }

    val num2 = listOf(3, 4, 23, 2, 34, 3)
    println(num2)
    val newmembers: ArrayList<Int> = arrayListOf<Int>()

    for (num2: Int in newmembers) {
        num2.takeIf { it % 2 == 0 }?.let { newmembers.add(it) }
    }
    println(newmembers)
}
