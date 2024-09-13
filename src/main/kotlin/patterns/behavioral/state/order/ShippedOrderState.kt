package patterns.behavioral.state.order

class ShippedOrderState : OrderState {
    override fun cancelOrder(orderId: String) {

        println("order with $orderId id is shipped already can not be canceled ")
    }

    override fun shipOrder(orderId: String) {
        println("order with $orderId id is shipped already can not be reshipped ")

    }

    override fun createOrder(order: ShopOrder) {
        println("order with ${order.id} id is shipped can not be reshipped please create a new one ")
    }
}