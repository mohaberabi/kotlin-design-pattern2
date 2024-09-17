package patterns.creational.abstract_factory


class YellowPaymentCard(
    override val cvv: Int,
    override val holder: String,
    override val expDate: String,
) :
    OnlinePaymentCard(
        cvv = cvv,
        expDate = expDate,
        holder = holder
    ) {
    override fun authorizePayment() {
        TODO("Not yet implemented")
    }

    override fun calculatePaymentFees(amount: Double) {
        TODO("Not yet implemented")
    }

    override fun startMoneyTransfer() {
        TODO("Not yet implemented")
    }

}