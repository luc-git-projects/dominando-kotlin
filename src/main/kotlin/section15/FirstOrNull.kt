package section15

fun main(){

    val person = Person.data()
        .firstOrNull { it.name == "Gustav" }
        ?.age

    println(person)
}