package patterns.structural.adapter.weather

interface WeatherServiceAdapter {


    fun getTemperature(lat: Double, lng: Double): Temperature
}


fun main() {


    val thirdPartyWeatherService = ThirdPartyWeatherService()


    val legacy = LegacyWeatherService(thirdPartyWeatherService)
    val adapter = WeatherServicesAdaptee(legacy)

    val res = adapter.getTemperature(213.1231, 123.2)

    println(res)
}