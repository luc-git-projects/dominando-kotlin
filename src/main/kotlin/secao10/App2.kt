package secao10

fun main(){

    val dog = Dog("White")
    val cat = Cat("Orange")

    var a: Animal = dog
    var b: Animal = cat


    println(dog is Dog)
    println(dog is Animal)
    println(cat is Animal)

}