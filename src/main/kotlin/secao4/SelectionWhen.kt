package secao4

fun main(){
    val x = 7

    when(x){
        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("È 30")
        else -> println("Desconhecido")
    }

    when(x){
        in 0 .. 10 -> println("0 a 10")
        in 11 ..30 -> println("11 a 30")
        else -> println("Desconhecido")
    }

    when(x){
        0, 2, 4, 6 -> println("É par")
        else -> println("È impar")
    }
}