package patterns.structural.bridge.flight

class EgyptAir(override val loyalty: FlightLoyalty) : Airline {
    override fun book(from: String, to: String) {
        println("Book flight from ${from} to ${to} with a discount ${calculateDiscount()}")
    }

    override fun calculateDiscount(): Double {
        return when (loyalty.type) {
            LoyaltyType.Basic -> 100.0
            LoyaltyType.Premium -> 190.0
        }
    }
}