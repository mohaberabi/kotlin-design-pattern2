package patterns.structural.adapter.weather

class LegacyWeatherService(
    private val weatherApi: ThirdPartyWeatherService,
) {


    fun getTemperature(city: String, country: String): String {
        return weatherApi.getTemperature(city, country)
    }


}