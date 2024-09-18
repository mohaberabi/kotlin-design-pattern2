package patterns.structural.bridge.flight

interface Airline : LoyaltyProgram {


    fun book(from: String, to: String)
}