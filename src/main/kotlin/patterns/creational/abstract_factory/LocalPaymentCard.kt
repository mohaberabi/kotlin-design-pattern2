package patterns.creational.abstract_factory

abstract class LocalPaymentCard(

    open val cvv: Int,
    open val holder: String,
    open val expDate: String,
) : PaymentCard