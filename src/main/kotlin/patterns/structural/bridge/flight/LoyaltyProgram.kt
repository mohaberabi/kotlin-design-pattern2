package patterns.structural.bridge.flight

interface LoyaltyProgram {
    val loyalty: FlightLoyalty


    fun calculateDiscount(): Double
}