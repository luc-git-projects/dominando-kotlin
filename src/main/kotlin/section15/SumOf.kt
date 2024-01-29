package section15

fun main(){

    val sumOfAges = Person.data().filter { it.name.startsWith("R", true) }.sumOf { it.age }
    println(sumOfAges)
}