package patterns.creational.factory

interface PaymentMethod {


    fun authenticate(id: String)


    fun startMoneyTransfer(from: String, to: String, amount: Double)


    fun calculateFee(): Double
}