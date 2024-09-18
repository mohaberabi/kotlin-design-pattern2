package patterns.structural.composite.cart

class BundledItem(
    private val items: List<ShoppingItem>
) : Cartable {

    override fun getPrice(): Double {
        return items.sumOf { it.getPrice() }
    }

}