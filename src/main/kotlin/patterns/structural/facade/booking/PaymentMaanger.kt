package patterns.structural.facade.booking

class PaymentMaanger {


    fun pay(
        amount: Double,
        method: String,
    ) = println("payed $amount using $method")
}