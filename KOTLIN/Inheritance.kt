// fun main() {
//     var mysize = corgi()
//     mysize.bark()
//     mysize.play()
// }

// open class dog{
    
//     fun bark()
//     {
//         println("bark")
//     }
//     fun play()
//     {
//         println("playing")
//     }
// }
// class corgi:dog()
// {
   
// }

//Constructor

fun main() {
    var carol = daughter("french")
    println(carol.haircolor)
    carol.say("hii")
}
open class mom(nativetongue:String)
{
    val haircolor = "brown"
    val eyecolor =  "blue"

    fun say(message:String)
    {
        println("mom says  $message")
    }
}

// class daughter(nativetongue :String) : mom(nativetongue)

//inheritance override

// fun main() {
//     var carol = daughter("french")
//     println(carol.haircolor)
//     println(carol.eyecolor)
//     carol.say("hii")
// }
// open class mom(nativetongue:String)
// {
//     open val haircolor = "brown"
//     val eyecolor =  "blue"

//     open fun say(message:String)
//     {
//         println("mom says  $message")
//     }
// }

// class daughter(nativetongue :String) : mom(nativetongue)
// {
//     override val haircolor  ="red"

//     override fun say(message:String)
//     {
//         println("daughter says  $message")
//     }
// }

//super keyword

fun main() {
    var carol = daughter("french")
    println(carol.haircolor)

    println(carol.eyecolor)
    carol.say("hii")
}
open class mom(nativetongue:String)
{
    open val haircolor = "brown"
    val eyecolor =  "blue"

    open fun say(message:String)
    {
        println("mom says  $message")
    }
}

class daughter(nativetongue :String) : mom(nativetongue)
{
    override val haircolor  ="red"

    override fun say(message:String)
    {
        println("daughter says $message")
        super.say(message)
        println("mother has ${super.haircolor} hair color")
    }
}

