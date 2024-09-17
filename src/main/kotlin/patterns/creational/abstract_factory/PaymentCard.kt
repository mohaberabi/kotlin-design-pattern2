package patterns.creational.abstract_factory


enum class PaymentCardType {
    Visa,
    MasterCard,
    PayPal,
    AmericanExpress,
    Payoneer,
    Yellow
}

interface PaymentCard {
    fun authorizePayment()
    fun startMoneyTransfer()
    fun calculatePaymentFees(amount: Double)
}