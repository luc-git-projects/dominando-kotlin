package secao9

fun main(){
    var r1 = Rectangle(10, 3)

    println(r1.width)
    println(r1.height)
    println(r1.surface)
}

class Rectangle(width: Int, height: Int){

     var width: Int = width
         private set(value){
             if(value >= 0){
                 field = value
             }
         }

     var height: Int = height
         private set

     val surface: Int
         get() = width * height

}