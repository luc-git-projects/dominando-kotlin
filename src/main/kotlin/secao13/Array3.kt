package secao13

import secao8.Math2

fun main(){
    val circles = arrayOf(
        Circle(1.0),
        Circle(3.0),
        Circle(6.0)
    )

//    repeat(circles.size){
//        val circle = circles[it]
//        val surface = circle.surface()
//        println(surface)
//    }

//    for(i in circles.indices){
//        println(circles[i].surface())
//    }

//    for (c in circles){
//        println(c.surface())
//    }

    /*circles.forEach { c ->
        println(c.surface())
    }*/

    circles.forEach {println(it.surface())
    }
}

class Circle(val radius : Double){
    fun surface() = Math2.pi * radius * radius
}