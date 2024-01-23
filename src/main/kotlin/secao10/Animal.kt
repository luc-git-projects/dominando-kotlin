package secao10

abstract class Animal(val color: String) {

    fun eat(){
        println("Eating")
    }

    protected fun sleep(){
        println("Sleeping")
    }
}