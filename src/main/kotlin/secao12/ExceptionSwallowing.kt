package secao12

fun main(){
    val bankAccount = BankAccount()
    try{

        bankAccount.deposit(300.0)
        bankAccount.withdraw(500.0)
    }catch (e : InsufficientFundsException){

    }
    println(bankAccount.balance)
}