package patterns.structural.bridge.flight


enum class LoyaltyType {
    Basic,
    Premium
}

data class FlightLoyalty(
    val type: LoyaltyType,

    )
