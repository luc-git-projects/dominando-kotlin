package secao7

fun main(){
    sayHello("Luciano", 27)
    sayHello("Otávia", 24)
    sayHello("João", 38)


}

private fun sayHello(name: String, temperature: Int){
    println("Hi $name! Temperature is $temperature degrees")
}
