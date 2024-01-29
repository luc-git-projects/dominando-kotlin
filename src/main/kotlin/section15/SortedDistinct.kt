package section15

fun main(){

    Person.data()
        .map { it.age }
        .distinct()
        .sorted()
        .forEach { println(it) }
}