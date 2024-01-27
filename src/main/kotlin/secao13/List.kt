package secao13

fun main(){
    val l1 = listOf(1, 2, 3, 4, 5)
    val l2 = emptyList<Int>()
    val l3  = mutableListOf(1, 2, 3 , 4, 5)
    val l4 = listOfNotNull(1, 2, 3, null, 4, 5, 6)

    l3.add(10)

    val emptyList = mutableListOf<Int>()
    emptyList.add(10)
    emptyList.add(3)
    emptyList.add(9)
    emptyList.add(3)
    emptyList.add(15)

    l3.forEach { println(it) }

     println("\n")

    l4.forEach { println(it) }

    println("\n\n")

    emptyList.forEach { println(it) }
}