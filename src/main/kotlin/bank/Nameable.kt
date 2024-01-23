package bank

interface Nameable {
    val firstName: String
    val lastName: String
    val fullName : String
        get() = "$firstName $lastName"
}
