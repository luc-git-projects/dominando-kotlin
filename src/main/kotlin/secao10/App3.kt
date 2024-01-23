package secao10

fun main(){

    val cat = Cat("Black")
    val dog = Dog("White")

    val animal: Animal = Cat("Green")

    cat.miau()
    cat.eat()
    println(cat.color)

    dog.bark()
    dog.eat()
    println(dog.color)
}