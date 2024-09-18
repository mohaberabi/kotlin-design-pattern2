package patterns.structural.adapter.weather

class WeatherServicesAdaptee(
    private val service: LegacyWeatherService,
) : WeatherServiceAdapter {


    override fun getTemperature(longitude: Double, latitude: Double): Temperature {
        val temperatureDataInXML: String = service.getTemperature(
            getCityOf(longitude, latitude),
            getCountryOf(longitude, latitude)
        )
        return convertXMLDataToJson(temperatureDataInXML)
    }

    private fun convertXMLDataToJson(xmlData: String): Temperature {
        println("Converting...")
        return Temperature("Converted Data from XML into JSON")
    }

    private fun getCityOf(longitude: Double, latitude: Double): String {
        println("Extracting city of longitude: $longitude and latitude: $latitude")
        return "City"
    }

    private fun getCountryOf(longitude: Double, latitude: Double): String {
        println("Extracting country of longitude: $longitude and latitude: $latitude")
        return "Country"
    }

}

