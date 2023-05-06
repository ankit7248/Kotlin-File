fun main(){
   Hello.obj1.yes()
   Hello.obj2.no()
   Hello.yes()   
   Hello.no()// by using companion object
}

class Hello{
   companion object obj1{
        fun yes()
        {
              println("yes bro")
        }
    }

    companion object obj2
    {
        fun no(){
            println("no bro")
        }
    }
   
}