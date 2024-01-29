package section15

fun main(){

    val map = Person.data()
        .associate { it.name to it.age }
        .forEach { (n, a) -> println("$n => $a") }

}