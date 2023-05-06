fun main() {
    println(4 + 2)
    println(4F / 2F)
    println("hii" + "myname is ")

    var cats = 5
    cats++
    println("$cats")

    var cat = 5
    println("${++cat}")

    // result type

    val a: Long = 28393792739
    val b: Float = 29.293F
    val result = a * b
    println(result::class.java)

    var dozen = 12
    var month = dozen
    println("$month")

    var bike = 5
    bike + 1
    println(bike)
    bike += 1
    println(bike)

    println("addition ${a+b}")

    println(true && false)

    println("$a > $b will return ${a > b}")

    println(a < b)
    
    val exp3 =((true && false ) || (true || false))
    println(exp3)
    
}
