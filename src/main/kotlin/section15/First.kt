package section15

fun main(){

    val person = Person.data()
        .first { it.name == "Gustavo" }
        .age

    println(person)
}