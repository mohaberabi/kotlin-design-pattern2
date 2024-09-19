package patterns.structural.facade.booking

data class Trip(


    val id: String,
    val from: String,
    val to: String,
    val amount: Double,
    val checkinDate: String,
    val checkoutDate: String,
    val paymentMethod: String,
    val carId: String,
    val carFrom: String,
    val carTo: String,
    val flightDate: String,
)
