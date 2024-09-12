package solid.openclose.violation


enum class Product(val price: Double) {
    Electronics(100.1),
    Clothing(200.5),
    Books(90.89)

}

class DiscountCalculator {
    fun getDiscount(
        product: Product,
    ): Double = when (product) {
        Product.Electronics -> product.price * 0.1
        Product.Clothing -> product.price * 0.2
        Product.Books -> product.price * 0.7
    }
}