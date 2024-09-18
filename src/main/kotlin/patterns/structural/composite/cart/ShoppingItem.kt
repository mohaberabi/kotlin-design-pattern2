package patterns.structural.composite.cart

class ShoppingItem(
    private val price: Double
) : Cartable {
    override fun getPrice(): Double = price
}