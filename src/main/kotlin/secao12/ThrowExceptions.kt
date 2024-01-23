package secao12

fun main(){
    val account = BankAccount()
    account.deposit(500.0)
    account.withdraw(100.0)
    println(account.balance)
}

class BankAccount{
     var balance : Double = 0.0
         private set


     fun deposit(value: Double){
         balance += value
     }

    fun withdraw(value : Double){
        balance -= value
    }
}