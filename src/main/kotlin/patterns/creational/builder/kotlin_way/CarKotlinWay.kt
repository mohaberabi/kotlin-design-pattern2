package patterns.creational.builder.kotlin_way

class CarKotlinWay private constructor(
    val make: String,
    val model: String,
    val year: Int,
    val engine: Engine,
    val transmission: Transmission,
    val color: String,
    val airbags: Int,
    val sunroof: Boolean,
    val gps: Boolean,
    val heatedSeats: Boolean,
    val autopilot: Boolean
) {

    class Engine(val type: String = "V6", val horsepower: Int = 250, val turbo: Boolean = false) {
        override fun toString(): String {
            return "Engine(type='$type', horsepower=$horsepower, turbo=$turbo)"
        }
    }

    enum class Transmission {
        MANUAL, AUTOMATIC, SEMI_AUTOMATIC
    }

    override fun toString(): String {
        return """
            CarKotlinWay Details:
            Make: $make
            Model: $model
            Year: $year
            Engine: $engine
            Transmission: $transmission
            Color: $color
            Airbags: $airbags
            Sunroof: $sunroof
            GPS: $gps
            Heated Seats: $heatedSeats
            Autopilot: $autopilot
        """.trimIndent()
    }

    class Builder {
        var make: String = ""
        var model: String = ""
        var year: Int = 0
        var engine: Engine = Engine()
        var transmission: Transmission = Transmission.MANUAL
        var color: String = "White"
        var airbags: Int = 2
        var sunroof: Boolean = false
        var gps: Boolean = false
        var heatedSeats: Boolean = false
        var autopilot: Boolean = false

        fun build() = CarKotlinWay(
            make, model, year, engine, transmission, color, airbags,
            sunroof, gps, heatedSeats, autopilot
        )
    }
}

fun main() {
    val car = CarKotlinWay.Builder().apply {
        make = "Tesla"
        model = "Model S"
        year = 2024
        engine = CarKotlinWay.Engine(type = "V8", horsepower = 400, turbo = true)
        transmission = CarKotlinWay.Transmission.AUTOMATIC
        color = "Red"
        airbags = 6
        sunroof = true
        gps = true
        heatedSeats = true
        autopilot = true
    }.build()

    println(car)
}
