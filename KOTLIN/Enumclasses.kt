// fun main() {
//     val colors = color.red
//     when (colors)
//     {
//         color.blue ->println("you choose blue")
//         color.red ->println("you choose red")
//         color.green ->println("you choose green")
//     }
// }
// enum class color{
//     red(),
//     green,
//     blue
// }

fun main() {
    println(color.red.timesused)
    println(color.blue.name)
    println(color.green.ordinal)
}

enum class color(val timesused: Int) {
    red(34),
    green(23),
    blue(73)
}
