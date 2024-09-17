package patterns.creational.builder.java_way

class CarJavaWay private constructor(
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

    class Engine(val type: String, val horsepower: Int, val turbo: Boolean) {
        override fun toString(): String {
            return "Engine(type='$type', horsepower=$horsepower, turbo=$turbo)"
        }
    }

    enum class Transmission {
        MANUAL, AUTOMATIC, SEMI_AUTOMATIC
    }

    override fun toString(): String {
        return """
            CarJavaWay Details:
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
        private var make: String = ""
        private var model: String = ""
        private var year: Int = 0
        private var engine: Engine = Engine("V6", 250, false)
        private var transmission: Transmission = Transmission.MANUAL
        private var color: String = "White"
        private var airbags: Int = 2
        private var sunroof: Boolean = false
        private var gps: Boolean = false
        private var heatedSeats: Boolean = false
        private var autopilot: Boolean = false

        fun make(make: String): Builder {
            this.make = make
            return this
        }

        fun model(model: String): Builder {
            this.model = model
            return this
        }

        fun year(year: Int): Builder {
            this.year = year
            return this
        }

        fun engine(engine: Engine): Builder {
            this.engine = engine
            return this
        }

        fun transmission(transmission: Transmission): Builder {
            this.transmission = transmission
            return this
        }

        fun color(color: String): Builder {
            this.color = color
            return this
        }

        fun airbags(airbags: Int): Builder {
            this.airbags = airbags
            return this
        }

        fun sunroof(sunroof: Boolean): Builder {
            this.sunroof = sunroof
            return this
        }

        fun gps(gps: Boolean): Builder {
            this.gps = gps
            return this
        }

        fun heatedSeats(heatedSeats: Boolean): Builder {
            this.heatedSeats = heatedSeats
            return this
        }

        fun autopilot(autopilot: Boolean): Builder {
            this.autopilot = autopilot
            return this
        }

        fun build(): CarJavaWay {
            return CarJavaWay(
                make, model, year, engine, transmission, color, airbags,
                sunroof, gps, heatedSeats, autopilot
            )
        }
    }
}

fun main() {
    val v8Engine = CarJavaWay.Engine(type = "V8", horsepower = 400, turbo = true)

    val car = CarJavaWay.Builder()
        .make("Tesla")
        .model("Model S")
        .year(2024)
        .engine(v8Engine)
        .transmission(CarJavaWay.Transmission.AUTOMATIC)
        .color("Red")
        .airbags(6)
        .sunroof(true)
        .gps(true)
        .heatedSeats(true)
        .autopilot(true)
        .build()

    println(car)
}
