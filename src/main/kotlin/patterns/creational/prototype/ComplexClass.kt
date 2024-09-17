package patterns.creational.prototype

class ComplexClass(
    private val name: String,
    private val age: Int,
    private val lastName: String,
    private val email: String,
    private val username: String,
    private val address: String,
    private val type: String,
    private val membership: String,
) {
    fun clone(
        name: String = this.name,
        age: Int = this.age,
        lastName: String = this.lastName,
        email: String = this.email,
        username: String = this.username,
        address: String = this.address,
        type: String = this.type,
        membership: String = this.membership,
    ) = ComplexClass(
        name = name,
        age = age,
        lastName = lastName,
        email = email,
        username = username,
        address = address,
        type = type,
        membership = membership
    )
}