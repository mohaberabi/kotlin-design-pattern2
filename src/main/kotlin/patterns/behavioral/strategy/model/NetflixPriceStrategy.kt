package patterns.behavioral.strategy.model

interface NetflixPriceStrategy {

    fun getPrice(price: Double): Double
}


class GoldPriceStrategy : NetflixPriceStrategy {
    override fun getPrice(price: Double): Double = price - 20

}


class RegularPriceStrategy : NetflixPriceStrategy {
    override fun getPrice(price: Double): Double = price
}

class PremiumPriceStrategy : NetflixPriceStrategy {
    override fun getPrice(price: Double): Double = price - 30
}