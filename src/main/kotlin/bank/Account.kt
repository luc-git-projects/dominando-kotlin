package bank

class Account(private val owner : Nameable) : Printable{

    private var balance: Double = 0.0

    fun deposit(value: Double){
        balance += value
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }
}