package section15

fun main(){

    val minAge = Person.data().minOf { it.age }
    println(minAge)
}