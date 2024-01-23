package secao10

fun main(){
    val person1 = Person("Pedro", "Oliveira", 25)
    val person2 = Person("Pedro", "Oliveira", 25)

    println(person1)
    println(person2)
    println(person1.hashCode())
    println(person2.hashCode())
    println(person1 == person2)

    val person3 = person2.copy()
    println(person3)

    val person4 = person2.copy(age = 30)
    println(person4)
}

data class Person (
    val firstName: String,
    val lastName: String,
    val age: Int
)