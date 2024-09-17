package patterns.creational.abstract_factory

class PaymentCardProcessor(
    private val factory: PaymentCardFactory
) {


    fun pay(
        cvv: Int,
        type: PaymentCardType,
        holder: String,
        expDate: String,
    ) {
        val card = factory.create(cvv = cvv, type = type, holder = holder, expDate = expDate)
        card.authorizePayment()
        card.startMoneyTransfer()
        card.calculatePaymentFees(200.0)
    }
}