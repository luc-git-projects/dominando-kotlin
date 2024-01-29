package section15

fun main(){
    val sumAges = Person.data()
        .map { it.age }
        .reduce{acc, age -> acc + age}

    println(sumAges)
}