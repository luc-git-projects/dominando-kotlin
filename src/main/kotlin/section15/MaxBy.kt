package section15

fun main(){

    val maxName = Person.data()
        .map { it.name }
        .maxBy { it.length }

    println(maxName)
}