package patterns.structural.adapter.weather

class ThirdPartyWeatherService {


    fun getTemperature(city: String, country: String): String {

        println("Fetching Weather ")
        return "Temperature XML "
    }
}