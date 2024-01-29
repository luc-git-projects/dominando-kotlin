package section15

fun main(){

    Person.data()
        .map { it.name }
        .shuffled()
        .take(3)
        .forEach { println(it) }


    //Return one name
    println("Return one random name")
    Person.data()
        .map { it.name }
        .random()
        .forEach { println(it) }
}