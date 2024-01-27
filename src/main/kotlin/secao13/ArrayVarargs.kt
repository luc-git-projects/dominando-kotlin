package secao13

fun main(){
//    val result = sum(2, 5, 7, 6)
//    println("Sum = $result")

    val integers = intArrayOf(2, 5, 7, 8)

    // Spread operator  *
    val result = sum(*integers)
    println("Sum = $result")

}

//fun sum(n1: Int, n2 : Int) = n1 + n2

fun sum(vararg values : Int): Int{
    var sum = 0
    values.forEach { sum += it }
    return sum
}