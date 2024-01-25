package secao12

class InvalidValueException(private val value: Double) : RuntimeException("Value $value is not valid") {

}