class CurrentConditionsDisplay(weatherData: WeatherData) : Observer, DisplayElement {

    init {
        weatherData.registerObserver(this)
    }

    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity")
    }
}