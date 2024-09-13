package patterns.behavioral.state.order

class NewOrderState : OrderState {
    override fun cancelOrder(orderId: String) {

        println("order with $orderId id is not exist yet ")
    }

    override fun shipOrder(orderId: String) {
        println("order with $orderId id is not exist yet ")

    }

    override fun createOrder(order: ShopOrder) {
        println("order with ${order.id} id is created total = ${order.total}")
    }
}