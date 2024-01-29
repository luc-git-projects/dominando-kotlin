package section15

fun main(){
    val existsAge = Person.data()
        .none { it.age == 10 }

    println(existsAge)
}