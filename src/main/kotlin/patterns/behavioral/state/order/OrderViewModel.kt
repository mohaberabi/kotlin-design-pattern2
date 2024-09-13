package patterns.behavioral.state.order


class OrderViewModel {


    var state: OrderState = NewOrderState()
        private set


    fun createOrder(order: ShopOrder) {
        state.createOrder(order)
        state = ShippedOrderState()
    }

    fun shipOrder(id: String) {
        state.shipOrder(id)

    }

    fun cancelOrder(id: String) {
        state.cancelOrder(id)
    }
}


private fun main() {
    val order = ShopOrder("asd", 200)
    val viewmodel = OrderViewModel()
    viewmodel.cancelOrder(order.id)
    viewmodel.createOrder(order)
    viewmodel.createOrder(order)
    viewmodel.shipOrder(order.id)
    viewmodel.cancelOrder(order.id)
}