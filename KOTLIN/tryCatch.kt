fun main() {
    val arr = arrayOf(1, 2, 3)

    try {
        print(arr[5])
    } catch (ex: NullPointerException) {} catch (e: Exception) {
        println("Please check the array index")
    } finally {
        println("I will execute no matter what")
    }
}
