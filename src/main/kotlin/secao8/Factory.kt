package secao8

fun main(){
    var car1 = Factory.newCar("Palio")
    var car2 = Factory.newCar("Saveiro")
    var car3 = Factory.newCar("Gol")

    car1.print()
    car2.print()
    car3.print()

    println(Factory.instanceCount)
}

object Factory{

    var instanceCount = 0

    fun newCar(model: String): Car{
        instanceCount++
        return Car(model)
    }
}

class Car(private val model: String){

    fun print(){
        println(model)
    }
}