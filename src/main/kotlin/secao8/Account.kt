package secao8

class Account (private val accountNumber: String, private val accountOwner: String) {

    private var balance: Double = 0.0

    constructor() : this(Unit.toString(), Unit.toString()){
        println("Constructor()")
    }

    constructor(accountNumber: String, accountOwner: String, balance: Double): this(accountNumber, accountOwner){
        this.balance = balance
    }

    fun deposit(amount: Double){
        balance += amount
    }

    fun deposit(amount: Int){
        balance += amount.toDouble()
    }

    fun print(){
        println("Number: $accountNumber\nOwner: $accountOwner\nBalance: $balance\n")
    }
}