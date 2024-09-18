package patterns.structural.composite.cart

class Cart {


    private val items = mutableListOf<Cartable>()


    fun addToCart(item: Cartable) {
        items.add(item)
    }

    fun cartTotal() = items.sumOf { it.getPrice() }
}