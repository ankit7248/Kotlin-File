fun main() {
    var animals = arrayListOf("cat","mouse","bear")
    for(i in animals)
    {
        println("feed the $i")
    }
    
    // until -> it is print only 1,2,3,4 in range 1 to 5
    
for(i in 1 until 5){          
    println(i)
}
print("----------------------")

for(i in 10 downTo 1){
    println(i)
}
print("----------------------")

for(i in 10 downTo 1 step 2){
    println(i)
}
print("----------------------")

// step -> is use to jump the value 
for(i in 1..5 step 2){
    println(i)
}
    // for (i in 1..5) {
    //     val month = when(i)
    //     {
    //         1->"jan"
    //         2->"feb"
    //         3->"mar"
    //         4->"apr"
    //         5->"may"
    //         else -> "june"
    //     }

    //     println("$i is $month")

    }
    // var total = 0
    // for (i in 1..10) {
    //     total+=i
    // }
    // println("total is $total")

    // val customers = hashMapOf(Pair("alice", 4), Pair("judy", 5), Pair("mohan", 9))
    // for (i in customers.keys) {
    //     val purchases = customers.get(i)
    //     println("$i  purchsed $purchases items")
    // }

    // for (i in 10 downTo 0) {
    //     println(i)
    //     when(i)
    //     {
    //         9->println("start your engines")
    //         6->println("on your marks")
    //         3->println("get set")
    //         0->println("go")
    //     }
    //   }

    // Ranges can be ascending ex - 1..10 or descending ex- 10 downTO 0
    // can skip steps 10 downTo step 3

    // for (i in 10 downTo 0 step 3) {
    //     println(i)
    // }

    // // Nested loop

    // for (i in 1..5) {
    //     for (j in 1..5) {
    //         print("$i , $j \t")
    //     }
    //     println()
    // }
//     for (i in 1..10) {
//         for (j in 1..i) {
//             print(" 😃 ")
//         }
//         println()
//     }
// }

