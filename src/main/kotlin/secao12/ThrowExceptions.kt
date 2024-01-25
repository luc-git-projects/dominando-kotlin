package secao12

fun main(){
    val account = BankAccount()
    try{
        account.deposit(5000.0)
        account.withdraw(200.0)
    }catch (e : InvalidValueException){
        println("Ops, invalid deposit: ${e.message}")
    }catch(e: InsufficientFundsException){
        println(e.message)
    }finally{
        println(account.balance)
    }

}

class BankAccount{
     var balance : Double = 0.0
         private set

     fun deposit(value: Double){

         if(value <= 0){
             throw InvalidValueException(value)
         }
         balance += value
     }

    fun withdraw(value : Double){

        if(value <= 0){
            throw InvalidValueException(value)
        }

        if(balance - value < 0){
            throw InsufficientFundsException(balance)
        }
        balance -= value
    }
}