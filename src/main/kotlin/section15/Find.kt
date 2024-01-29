package section15

fun main(){
     val person = Person.data()
         .find { it.name == "Gustavo" }
         ?.age
         ?: 0

    println(person)
}