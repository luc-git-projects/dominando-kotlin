package secao11

class Dog : Animal() {

    fun run(){
        println("Running...")
    }

    override fun eat(){
        println("Dog eating...")
    }
}