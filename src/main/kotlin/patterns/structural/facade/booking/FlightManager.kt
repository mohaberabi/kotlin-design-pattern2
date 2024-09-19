package patterns.structural.facade.booking

class FlightManager {


    fun bookFlight(
        from: String,
        to: String,
        date: String
    ) = println("Booking  flight from $from to $to at $date")

}