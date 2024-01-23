package secao9

fun main(){
    var ac1 = Account(1000.0)
    ac1.deposit(500.0)
    ac1.showBalance()

    ac1.withdraw(1501.0)
    ac1.showBalance()
}

class Account(private var balance: Double){

    init{
        require(balance >= 0)
    }
    fun deposit(amount: Double){
        require(amount > 0)
        balance += amount
    }

    fun withdraw(amount: Double){
        require(amount > 0)
        balance -= amount
    }

    fun showBalance(){
        println(balance)
    }
}