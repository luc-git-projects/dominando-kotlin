package secao13

import java.util.*

fun main(){

    val dogs = mutableSetOf<Dog>()
    dogs.add(Dog("01"))
    dogs.add(Dog("02"))
    dogs.add(Dog("02"))
    dogs.add(Dog("03"))
    dogs.add(Dog("04"))
    dogs.add(Dog("04"))

    println(dogs)

}

class Dog(val name : String){
    override fun toString() = "Dog(name=$name, hashCode=${hashCode()})"

    override fun hashCode(): Int{
//        return Objects.hash(name)
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean{
        return if(other is Dog){
            this.name == other?.name
        }else{
            false
        }
    }
}