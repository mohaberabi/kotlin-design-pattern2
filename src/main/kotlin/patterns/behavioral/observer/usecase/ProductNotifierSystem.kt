package patterns.behavioral.observer.usecase

import patterns.behavioral.observer.design.ProductObserver
import patterns.behavioral.observer.design.ProductSubject
import patterns.behavioral.observer.model.Customer
import patterns.behavioral.observer.model.MarketPlace
import patterns.behavioral.observer.model.Product
import kotlin.random.Random


private fun main() {


    val products = mutableListOf<Product>()
    val customers = mutableListOf<Customer>()
    val productSubject = ProductSubject()
    val market = MarketPlace(
        products = products,
        customers = customers,
    )

    val randomCustomers = buildList<Customer> {
        repeat(10) {
            add(
                Customer(
                    "fake product ",
                    subscribedToProducts = Random.nextBoolean(),
                    name = "some user $it"
                )
            )

        }
    }
    val randomProducts = buildList<Product> {
        repeat(10) {
            add(
                Product(
                    "uid",
                    20.0
                )
            )

        }
    }
    for (random in randomCustomers) {
        market.addCustomer(random)
        if (random.subscribedToProducts) {
            val observer = ProductObserver(random.name)
            productSubject.subscribe(observer)
        }
    }
    for (random in randomProducts) {
        market.addProduct(random)
        productSubject.notifyAll(random)
    }


}