package patterns.structural.facade.booking

class CarRentalManager {


    fun rentCar(start: String, end: String, carId: String) {
        println("Renting car from $start to $end car id is $carId")
    }
}