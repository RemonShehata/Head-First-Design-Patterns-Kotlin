class WeatherData {

    //This method gets called whenever the weather measurements have been updated
    fun measurementsChanged() {
        val temp = getTemperature();
        val humidity = getHumidity();
        val pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}