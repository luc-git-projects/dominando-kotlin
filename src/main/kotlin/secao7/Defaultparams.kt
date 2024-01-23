package secao7

fun main(){
    sayHello("Pedro", "tudo bem")
}

private fun sayHello(name:String = "Desconhecido", message:String){
    println("Hi, $name! $message?")
}