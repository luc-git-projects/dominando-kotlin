package secao4


fun main(){
    val x = 0

    val retorno = when{
        x > 0 -> "POSITIVO"
        x < 0 -> "NEGATIVO"
        else -> "ZERO"
    }

    println(retorno)


    val s = 'd'
    val v = when(s){
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }

    println(v)
}