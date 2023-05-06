fun main() {
    var fn: (a: Int, b: Int) -> Int = ::sum

    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2 + 3
        "yes"
        2
    }
}

fun sum(a: Int, b: Int): Int = a + b

fun calculator(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}
