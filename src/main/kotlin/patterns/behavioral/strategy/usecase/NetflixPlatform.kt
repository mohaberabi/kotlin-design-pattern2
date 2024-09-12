package patterns.behavioral.strategy.usecase

import patterns.behavioral.strategy.model.GoldPriceStrategy
import patterns.behavioral.strategy.model.NetFlixMembership
import patterns.behavioral.strategy.model.PremiumPriceStrategy
import patterns.behavioral.strategy.model.RegularPriceStrategy


private fun main() {
    val gold = NetFlixMembership(
        id = "gold",
        strategy = GoldPriceStrategy(), price = 200.0
    )
    val regular = NetFlixMembership(
        id = "gold",
        strategy = RegularPriceStrategy(),
        price = 300.0
    )
    val premium = NetFlixMembership(
        id = "gold",
        strategy = PremiumPriceStrategy(),
        price = 300.0
    )
    val total = gold.price() + regular.price() + premium.price()
    println(total)
}