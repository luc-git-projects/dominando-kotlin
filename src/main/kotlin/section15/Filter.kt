package section15

fun main(){
//    Person.data()
//        .filter { it -> it.age >= 18 }
//        .forEach { println(it) }

    Person.data()
        .filter { it -> it.age >= 18 }
        .forEachIndexed{i, p -> println("${i + 1} $p")}
}