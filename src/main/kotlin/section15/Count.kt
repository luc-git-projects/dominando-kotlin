package section15

fun main(){

//    val counter = Person.data()
//        .filter { it.name.startsWith("r", false) }
//        .count()

    val counter = Person.data().count { it.name.startsWith("R", true) }

    println("Number of Persons with name begins with letter R or r = $counter" )
}