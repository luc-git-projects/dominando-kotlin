package secao11

fun main(){
    val e1 = Programmer()
    e1.work()

    val e2 = KotlinProgrammer()
    e2.work()

    val e3 = Teacher()
    e3.work()

    var p: Programmer = KotlinProgrammer()
    p.work()

    p = Programmer()
    p.work()
}