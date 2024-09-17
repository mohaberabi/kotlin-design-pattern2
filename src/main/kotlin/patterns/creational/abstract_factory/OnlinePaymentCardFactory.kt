package patterns.creational.abstract_factory


class OnlinePaymentCardFactory : PaymentCardFactory {
    override fun create(
        cvv: Int, type: PaymentCardType, holder: String, expDate: String,
    ): PaymentCard {
        return when (type) {
            PaymentCardType.Payoneer -> PayoneerPaymentCard(cvv = cvv, holder = holder, expDate = expDate)
            PaymentCardType.PayPal -> PaypalPaymentCard(cvv = cvv, holder = holder, expDate = expDate)
            PaymentCardType.Yellow -> YellowPaymentCard(cvv = cvv, holder = holder, expDate = expDate)
            else -> throw IllegalArgumentException("Card not supported")
        }
    }
}