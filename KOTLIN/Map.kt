fun main() {
    val count =  mapOf(Pair(1, "ONE"),Pair(5, "two"),Pair(3, "three"))
    println(count)

    var count2 = mapOf<Int,String>()
    println(count2)
    println(count.get(2))
    println(count[2])
    println(count.keys)

    //Hash map
    val count5 =  hashMapOf(Pair(1, "ONE"),Pair(5, "two"),Pair(3, "three"))
    count5[5] = "five"
    println(count5)

    val countmore = mapOf(Pair(20,"twenty"),Pair(30,"thirty"))
    count5.putAll(countmore)
    println(count5)

    count5.remove(20)
    println(count5)

    count5.replace(2,"two")
    println(count5)

    // count5.clear()
    // println(count5)

    println(count5.size)
    println(count5.containsKey(3))

    println(count5.isEmpty())
    println(count5.isNotEmpty())
    
}