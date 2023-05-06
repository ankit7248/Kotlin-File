import kotlin.random.Random

    val words = listOf("elbow","writer","circle","polish","bridge","store")
    var word = ""
    var guesses = arrayListOf<Char>()
    var remainguess = 6
    var mistakes = 0

    fun main() {
        setupGame()
}

fun setupGame()
{
    var wordIndex:Int = Random.nextInt(words.size)
    word = words[wordIndex]
    println(word)

    for (i:Int in word.indices) {
        guesses.add('_')
    }

   
    var gameover = false
    do{
        printgamestatus()
        println("please enter a letter")
        var input : String = readLine()?:""

        if(input.isEmpty())
        {
            println("invalid input")
        }
        else{
            var letter :Char = input[0]
            if(word.contains(letter)){
                for (i in word.indices) {
                    if(word[i] == letter)
                    guesses[i] = letter
                }
            }
            
        }
        if(!guesses.contains('_'))
        
        gameover = true
        else {
            println("sorry, that's not part of the world")
            remainguess--
            if(mistakes == 6)
            {
            gameover = true
        }
        while(!gameover)
        if(mistakes == 6)
        {
            printgamestatus()
            println("sorry you lost. the word was \n $word")
        }
        else{
            println("\n congralations,you win!")
            println("the word was \n $word")
        }
    }

   
}
fun printgamestatus()
{
    when(mistakes)
    {
       0 -> printmistakes1()
       1 -> printmistakes2() 
       2 -> printmistakes3() 
       3 -> printmistakes4() 
       4 -> printmistakes5() 
       5 -> printmistakes6() 
       6 -> printmistakes7() 
    }

    print("word")
    for(element :Char in guesses)
    {
        print("$element")
        
    }
    println("\n you have $remainguess guess(es) left")
}
fun printmistakes1()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |         ")
    println("  |         ")
    println("  |         ")
    println(" /|\\       ")
    println("/ | \\      ")
}
fun printmistakes2()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |      0  ")
    println("  |         ")
    println("  |         ")
    println(" /|\\       ")
    println("/ | \\      ")
}
fun printmistakes3()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |      0  ")
    println("  |      |  ")
    println("  |      |  ")
    println(" /|\\       ")
    println("/ | \\      ")
}
fun printmistakes4()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |      0  ")
    println("  |      /|   ")
    println("  |      |  ")
    println(" /|\\       ")
    println("/ | \\      ")
}
fun printmistakes5()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |      0  ")
    println("  |     /|\\  ")
    println("  |      |    ")
    println(" /|\\       ")
    println("/ | \\      ")
}
fun printmistakes6()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |      0  ")
    println("  |     /|\\  ")
    println("  |      |    ")
    println(" /|\\   /   ")
    println("/ | \\      ")
}
fun printmistakes7()
{
    println("  |------|--")
    println("  |      |  ")
    println("  |      0  ")
    println("  |     /|\\ ")
    println("  |      |   ")
    println(" /|\\   / \\  ")
    println("/ | \\       ")
}
    



