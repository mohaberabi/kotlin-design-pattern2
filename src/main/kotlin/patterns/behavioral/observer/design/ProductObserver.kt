package patterns.behavioral.observer.design

import patterns.behavioral.observer.model.Product

class ProductObserver(
    private val username: String
) : Observer<Product> {
    override fun update(t: Product) = println(" Hey $username A New product Was Added :${t.name}")

}