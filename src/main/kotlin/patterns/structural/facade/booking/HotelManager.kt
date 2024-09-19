package patterns.structural.facade.booking

class HotelManager {


    fun reserveRoom(
        checkIn: String,
        checkout: String,
        id: String
    ) = println("Booked room from $checkIn to $checkout with id $id")
}