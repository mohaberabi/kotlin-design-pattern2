package patterns.creational.abstract_factory

import kotlin.math.exp

class VisaPaymentCard(
    override val cvv: Int,
    override val holder: String,
    override val expDate: String,
) :
    LocalPaymentCard(
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