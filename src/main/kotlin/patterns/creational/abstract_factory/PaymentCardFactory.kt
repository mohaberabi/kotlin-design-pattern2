package patterns.creational.abstract_factory

interface PaymentCardFactory {
    fun create(
        cvv: Int,
        type: PaymentCardType,
        holder: String,
        expDate: String,
    ): PaymentCard

}