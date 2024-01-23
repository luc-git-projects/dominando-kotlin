package secao8

fun main(){
    val a1 = Account("2564-8", "João")
    val a2 = Account("7541-9", "Maria")
    val a3 = Account()
    val a4 = Account("5681-9", "Luciano", 5000.0)

    a1.deposit(2000.0)
    a2.deposit(150.0)
    a4.deposit(2000)

    a1.print()
    a2.print()
    a3.print()
    a4.print()
}

