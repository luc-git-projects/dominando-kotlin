package secao13

fun main(){
    val a1 = arrayOf("A", null, "B")
    val a2 = arrayOfNulls<String>(10)
    val a3 = intArrayOf(1, 2, 3)
    val arrayZeros = Array(5) {0}

    for(i in 0 .. 4){
        println(arrayZeros[i])
    }

    println(arrayZeros.contentToString())
}