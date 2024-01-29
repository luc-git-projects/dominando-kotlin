package section15

fun main(){

    val result = Person.data().any { it.age == 101 }
    println(result)
}