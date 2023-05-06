fun main() {
    val numbers = setOf(4, 3, 56, 3)
    println(numbers)

    val numbers1 = setOf(4, 3, 56, 3, null, null)
    println(numbers1)

    println(numbers1.size)
    println(numbers.contains(2))

    println(numbers1.containsAll(setOf(4,3)))

    println(numbers1.isEmpty())
    

    var num = setOf<Int>()
    println(num)

    // Hash set

    val numbers2 = hashSetOf(4, 3, 56, 3)
    println(numbers2)

    // val nonum = hashSetOf<Int>()
    // println(nonum)

    // numbers2.add(5)
    // println(numbers2)

    // var newnumbers = setOf(15, 4)
    // numbers2.addAll(newnumbers)
    // println(numbers2)
    // numbers2.remove(3)
    // println(numbers2)

    // val toremove = hashSetOf(3,4)
    // numbers2.removeAll(toremove)
    // println(numbers2)

    val numbers3 = setOf(3,4,5,6)  //Find Intersection numbers between two sets
    numbers2.retainAll(numbers3)
    println(numbers2)

    numbers2.clear()
    println(numbers2)
    println(numbers2.isEmpty())

    var acceptedcolors = hashSetOf("white","black", "grey")
    var mycolors = hashSetOf("red","blue","black","green")

    acceptedcolors.add("red")

    acceptedcolors.retainAll(mycolors)
    println(acceptedcolors)
    
}
