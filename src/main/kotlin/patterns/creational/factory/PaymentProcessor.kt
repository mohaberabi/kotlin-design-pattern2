package patterns.creational.factory

class PaymentProcessor(
    private val factory: PaymentMethodFactory
) {


    fun pay(type: PaymentMethodType) {
        val paymentMethpd = factory.create(type)
        paymentMethpd.authenticate("")
        paymentMethpd.startMoneyTransfer("as", "asd", 200.0)
        println(
            paymentMethpd.calculateFee()
        )
    }

}