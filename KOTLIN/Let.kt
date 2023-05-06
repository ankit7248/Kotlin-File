

import kotlin.collections.arrayListOf

fun main() {
    // val animals = listOf("dog", "cat", "zebra", "mouse", "to")
    
    //         animals.map { it.length }
    //         .filter { it > 1 }
    //         //    .let {
    //         //       println(it)
    //         //       println("size of list is ${it.size}")
    //         //     }
    //         .let(::println)
    //         val name: String =readLine()?:""
    //         name?.let{
    //         println("your name is $name")
    //         }

    val emp = Employee()
    emp.name = "ankit"
    emp.age = 78
    emp.let { 
        println(it.name)
        println(it.age)
     }
     val dk: Employee? = null
     dk?.age = 20
     dk?.name = "ankit"

     dk?.let { 
        it.age =  20
        it.name = "ankit"
      }

      with(emp) { 
        age = 78
        name = "awdaw"
       } 
       emp.run {   // run -> is combination of with + let 
        age = 98
        name = "aasfaew"
        } 
}
data class Employee(var name: String = "",var age: Int = 22)

