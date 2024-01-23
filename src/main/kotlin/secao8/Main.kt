package secao8

fun main(){
    println(Math.sum(7, 8))
}

class Math(){

    companion object{

        fun sum(a: Int, b: Int) = a + b
    }
}