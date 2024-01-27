package secao13

fun main(){
    val s = sortedSetOf(Comparator.naturalOrder(), 1, 3, 8, 6, 2 ,0, 4, 9, 5, 7)
    println(s)

//    val dogs = sortedSetOf(
//        Comparator.comparing { it.name },
//        Dog("04"),
//        Dog("03"),
//        Dog("01"),
//        Dog("02")
//    )

    val dogs = sortedSetOf(
        Comparator.comparing { d: Dog -> d.name}.reversed(),
        Dog("04"),
        Dog("03"),
        Dog("01"),
        Dog("02")
    )

    println(dogs)
}