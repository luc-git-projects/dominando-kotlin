package secao4

import java.util.*

fun main(){

    val input = Scanner(System.`in`)
    print("Digite o número: ")
    val number = input.nextInt();

    if((number % 2 == 0) ){
        println("Numero é par")
    }else{
        println("Numero é impar")
    }

}