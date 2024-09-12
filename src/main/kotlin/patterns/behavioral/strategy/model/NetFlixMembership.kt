package patterns.behavioral.strategy.model

data class NetFlixMembership(
    private val id: String,
    private val strategy: NetflixPriceStrategy,
    private val price: Double
) {
    fun price() = strategy.getPrice(price)
}
