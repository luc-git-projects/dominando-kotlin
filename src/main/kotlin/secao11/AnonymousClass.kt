package secao11

fun main(){
    val vehicle = object :Vehicle{
        override fun drive(){
            println("Driving...")
        }
    }

    vehicle.drive()
}

interface Vehicle{
    fun drive()
}