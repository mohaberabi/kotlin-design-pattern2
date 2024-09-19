package patterns.structural.facade.booking

class TravelBookingFacade(
    private val carRentalManager: CarRentalManager,
    private val hotelManager: HotelManager,
    private val paymentMaanger: PaymentMaanger,
    private val flightManager: FlightManager,
) {
    fun bookTrip(trip: Trip) {
        carRentalManager.rentCar(
            start = trip.carFrom,
            end = trip.carTo,
            carId = trip.carId
        )

        hotelManager.reserveRoom(
            checkIn = trip.checkinDate,
            checkout = trip.checkoutDate,
            id = "111"
        )
        paymentMaanger.pay(
            amount = trip.amount,
            method = trip.paymentMethod,
        )
        flightManager.bookFlight(
            from = trip.from,
            to = trip.to,
            date = "Now"
        )
    }
}