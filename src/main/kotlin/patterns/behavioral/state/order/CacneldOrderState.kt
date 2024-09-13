package patterns.behavioral.state.order

class CacneldOrderState : OrderState {
    override fun cancelOrder(orderId: String) {

        println("order with $orderId id is canceled already")
    }

    override fun shipOrder(orderId: String) {
        println("order with $orderId id is canceled can not be shipped")

    }

    override fun createOrder(order: ShopOrder) {
        println("order with ${order.id} id is canceled can not be created please create a new one ")
    }
}