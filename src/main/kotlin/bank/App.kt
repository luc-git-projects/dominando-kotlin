package bank

fun main(){
    val account = Account(PersonName("Luciano", "Oliveira"))
    account.deposit(1000.0)
    account.print()
}