package patterns.structural.facade.booking


private fun main() {


    val trip = Trip(
        id = "1", "now", "next year",
        amount = 9000.0,
        checkinDate = "now",
        checkoutDate = "next year",
        carId = "Toyota 2024",
        carTo = "next year",
        carFrom = "now",
        paymentMethod = "Visa",
        flightDate = "now"
    )
    val facacde = TravelBookingFacade(
        hotelManager = HotelManager(),
        paymentMaanger = PaymentMaanger(),
        carRentalManager = CarRentalManager(),
        flightManager = FlightManager()
    )
    facacde.bookTrip(trip)
}