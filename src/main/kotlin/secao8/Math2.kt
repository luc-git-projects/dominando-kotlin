package secao8

fun main(){
    println(Math2.subtract(7, 4))
    println(Math2.sum(8, 3))
    println(Math2.pi)
}

object Math2{

    val pi = 3.1416
    fun subtract(a: Int, b: Int) = a - b

    fun sum(a: Int, b: Int) = a + b
}