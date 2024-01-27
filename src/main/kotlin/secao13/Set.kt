package secao13

fun main(){

    val s1 = setOf(2, 4, 9, 2, 1, 7)
    println("Print immutable s1")
    s1.forEach { println(it) }

    val s2 = mutableSetOf(6, 8, 9, 63, 1, 14)
    s2.add(9)
    s2.add(984)

    println("\n\nPrint mutable s2")
    s2.forEach { println(it) }

    val s3 = setOfNotNull(7, 9, 2, 4, null, 9, 8965)
    println("\n\nPrint immutable not null s3")
    s3.forEach { println(it) }

    val emptySet = mutableSetOf<Double>()
    emptySet.add(5.4)
    emptySet.add(7.6)
    emptySet.add(1.36)
    emptySet.add(9.354)
    emptySet.add(7.6)
    println("\n\nPrint mutable empty set")
    emptySet.forEach { println(it) }

    val hs1 = hashSetOf(2,4, 7, 3)
    hs1.add(5)
    println("\n\nPrint mutable empty set")
    hs1.forEach { println(it) }

}