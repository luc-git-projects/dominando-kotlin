package secao12

class InsufficientFundsException(val currentBalance: Double) : RuntimeException() {
    override val message = "Balance less than the amount withdraw"
}