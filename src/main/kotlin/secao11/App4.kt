package secao11

fun main(){
    val a : Dog = Dog()
    a.run()
    a.eat()

    val b : Animal = Dog()

    if(b is Dog){
        b.run()
        b.eat()
    }
}