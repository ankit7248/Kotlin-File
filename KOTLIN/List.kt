fun main() {
    val colors = mutableListOf("blue", "red", "red", "yellow") 
    colors[2] = "me hu"
    println(colors)

    println(colors.contains("red")) // true
    println(colors.contains("pink")) // false

    val newcolors = listOf("blue", "red", "red", "yellow") // false
    println(newcolors.containsAll(colors))

    println(colors.indexOf("red"))
    println(colors.indexOf("red"))

    // println(colors)
    // var colors1 = listOf<String>()
    // println(colors1)
    // var colors3 =  listOf("blue","yellow",null,"blue")
    // println(colors3)
    // println(colors[0])
    // println(colors.get(1))
    // println(colors[5])
    // println(colors.size)

    // Array list

    var colors4 = arrayListOf("blue", "red", "yellow")
    colors4.add("pink")
    println(colors4)

    colors4.set(1, "redder")

    val subcolor = colors.subList(1, 3) // print 1 to 3 elements
    println(subcolor)
    println(subcolor::class.java)



    var suck = arrayListOf("pink", "teal")
    colors4.addAll(suck)
    println(colors4)

    colors4.remove("pink")
    println(colors4)

    colors4.removeAll(suck)
    println(colors4)

    colors4.removeAt(1)
    println(colors4)

    colors4.add("red")
    colors4.add("blue")
    colors4.add("red")

    colors4.remove("red")
    println(colors4)

    println(colors4.size)

    var items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    var removedItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)
    // items.remove("pen")
    // items.remove("paper")
    // items.remove("mug")
    // items.remove("phone")
    println(items)
    // val removedItems = listOf()

    println(colors4.clear())
    println(colors4.isEmpty())


    var animals = arrayListOf("lion","zebra","chimp","elephant")
    println(animals)
    animals.add("panda")
    animals.remove("lion")
    println(animals)
    println(animals.contains("elephant"))
    println(animals.contains("giraffe"))
    
}
