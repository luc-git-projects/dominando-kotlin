package secao12

fun main(){
//    val  x = throw IllegalArgumentException()
    val i : Int? = 100
    val d = i?.toDouble() ?: IllegalArgumentException()

    println(d)
}