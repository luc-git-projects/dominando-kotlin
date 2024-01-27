package secao13

import java.util.Arrays

fun main(){
    val array = Array(5) {"*"}
//    val array = arrayOf("*", "*", "*", "*")
    array[0] = "A"
    array[3] = "D"


    println(array.contentToString())

    println(array[0])
    println(array[3])

}