package section15

fun main(){

    Person.data()
        .map { it.name }
        .forEach { println(it) }
}