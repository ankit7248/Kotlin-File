fun main(){
    add(3,2,12,2,23,3,2)
    add(1,1,1,1,1,1,1,1,1,1,1,1)
}
fun add(vararg values: Int){
    var sum = 0
    for (i in values) {
        sum += i
    }
    println(sum)
}
