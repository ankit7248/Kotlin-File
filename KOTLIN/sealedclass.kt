fun main() {
    val someplant = getplant()

    when (someplant) {
        is fruit -> println("sweet")
        is vegetable -> println("tasty")
    }
}

abstract class plant

sealed class fruit : plant()

class apple : fruit()

sealed class vegetable : plant()

class potato : vegetable()

fun getplant(): plant = apple()
