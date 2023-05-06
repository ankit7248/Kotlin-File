fun main(){
    println("hello ankit".formattedString())
}
fun String.formattedString(): String{
    return "----------------\n$this\n------------------"
}