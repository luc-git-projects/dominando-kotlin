package secao6

fun main(){
    val value: Int? = null

    val value2 = if(value != null){
        value
    }else{
        0
    }
    println(value2)

    val value3 = value ?: 7
    println(value3)
}