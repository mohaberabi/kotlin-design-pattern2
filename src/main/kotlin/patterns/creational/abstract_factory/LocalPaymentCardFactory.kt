package patterns.creational.abstract_factory

class LocalPaymentCardFactory : PaymentCardFactory {
    override fun create(
        cvv: Int, type: PaymentCardType, holder: String, expDate: String,
    ): PaymentCard {


        return when (type) {
            PaymentCardType.Visa -> VisaPaymentCard(cvv = cvv, holder = holder, expDate = expDate)
            PaymentCardType.MasterCard -> MasterCardPaymentCard(cvv = cvv, holder = holder, expDate = expDate)
            PaymentCardType.AmericanExpress -> AmericanExpressPaymentCard(cvv = cvv, holder = holder, expDate = expDate)
            else -> throw IllegalArgumentException("Card not supported")
        }
    }
}