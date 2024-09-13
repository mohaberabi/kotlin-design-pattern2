package patterns.behavioral.state.order

interface OrderState {


    fun cancelOrder(orderId: String)
    fun shipOrder(orderId: String)
    fun createOrder(order: ShopOrder)

}

data class ShopOrder(val id: String, val total: Int)