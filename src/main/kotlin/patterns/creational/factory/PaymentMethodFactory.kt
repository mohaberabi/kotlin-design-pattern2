package patterns.creational.factory


class PaymentMethodFactory {
    fun create(
        type: PaymentMethodType,
    ): PaymentMethod = when (type) {
        PaymentMethodType.PayPal -> PaypalPaymentMethod()
        PaymentMethodType.Visa -> VisaPaymentMethod()
        PaymentMethodType.MasterCard -> MasterCardPaymentMethod()
    }
}