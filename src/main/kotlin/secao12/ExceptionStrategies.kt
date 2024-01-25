package secao12

fun main(){
    a()
}

fun a(){
    try{
        b()
    }catch(b : B){
        throw A(b)
    }

}

fun b(){
    throw B()
}

class A(cause : Throwable) : RuntimeException(cause)
class B : RuntimeException()