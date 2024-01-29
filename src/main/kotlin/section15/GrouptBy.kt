package section15

fun main(){
     val people = Person.data()
         .groupBy { it.name[0] }
         .forEach{ (k, v) -> println("$k => $v")}
}