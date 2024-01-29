package section15

fun main(){
    val existsAge = Person.data()
        .all { it.age == 10 }

    println(existsAge)
}