package patterns.behavioral.observer.model

data class Customer(
    val uid: String,
    val name: String,
    val subscribedToProducts: Boolean = false,
)
