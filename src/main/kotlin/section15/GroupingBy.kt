package section15

fun main(){
    Person.data()
        .groupingBy { it.name[0] }
        .eachCount()
        .forEach { (k, v) -> println("$k => $v") }
}