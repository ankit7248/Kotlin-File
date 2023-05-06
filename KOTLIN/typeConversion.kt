fun main() {
    // var cats = 8
    // var longCats = cats.toLong()
    // println(cats :: class.java)
    // println(longCats:: class.java)

    // val people  = 383898323423
    // val fewpeople = people.toInt()
    // println(people :: class.java)
    // println(fewpeople :: class.java)

    // val peoples  = 34
    // val fewperson = people.toFloat()
    // println(peoples :: class.java)
    // println(fewperson :: class.java)

    // var value = 8
    // var valueString = value.toString()
    // println(valueString::class.java)

    var pi = 4.14159
    var value1 = readLine()?:""
    println("${pi * value1.toDouble()}")

    var test = readLine()
    println(test?.toInt())
    
}