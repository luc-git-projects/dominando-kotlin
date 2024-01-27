package secao13

fun main(){
//    mapOf(
//        Pair(1, "A"),
//        Pair(2, "B")
//    )

    val map1 = mapOf(
        1 to "A",
        2 to "B"
    )

    println(map1)

    println(map1[2])

    val map2 = map1.toMutableMap()
    map2[4] = "B"

    println()

    println(map2)
}