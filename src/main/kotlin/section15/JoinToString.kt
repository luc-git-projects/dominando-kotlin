package section15

fun main(){

    val names = Person.data().joinToString(separator = "-"){it.name}
    println(names)

}