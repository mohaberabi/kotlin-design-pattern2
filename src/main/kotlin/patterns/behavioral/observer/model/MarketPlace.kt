package patterns.behavioral.observer.model

import patterns.behavioral.observer.design.ProductSubject

class MarketPlace(
    private val customers: MutableList<Customer>,
    private val products: MutableList<Product>,
) {
    fun addCustomer(customer: Customer) {
        customers.add(customer)

    }

    fun addProduct(product: Product) {
        products.add(product)
    }
}