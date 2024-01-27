package secao13

fun main(){

//    val codesMap = mapOf(
//        55 to "Brazil",
//        351 to "Portugual",
//        54 to "Argentina",
//        1 to "United States of America"
//    )
//
//    println(codesMap)

//    val codesMap = hashSetOf(
//        55 to "Brazil",
//        351 to "Portugual",
//        54 to "Argentina",
//        1 to "United States of America"
//    )
//
//    println(codesMap)


//    val codesMap = sortedMapOf(
//        55 to "Brazil",
//        351 to "Portugual",
//        54 to "Argentina",
//        1 to "United States of America"
//    )
//
//    println(codesMap)


    val codesMap = sortedMapOf(
        Comparator.reverseOrder(),
        55 to "Brazil",
        351 to "Portugual",
        54 to "Argentina",
        1 to "United States of America"
    )

    println(codesMap)
}