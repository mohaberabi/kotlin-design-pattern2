package patterns.creational.factory


class VisaPaymentMethod : PaymentMethod {
    override fun authenticate(id: String) {
        TODO("Not yet implemented")
    }

    override fun startMoneyTransfer(from: String, to: String, amount: Double) {
        TODO("Not yet implemented")
    }

    override fun calculateFee(): Double {
        TODO("Not yet implemented")
    }

}