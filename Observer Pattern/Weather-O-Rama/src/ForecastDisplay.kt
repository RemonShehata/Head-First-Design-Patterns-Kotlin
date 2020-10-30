class ForecastDisplay(weatherData: Subject) : Observer, DisplayElement {
    private var currentPressure = 0f
    private var lastPressure = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        print("Forecast: ")
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!")
        } else if (currentPressure == lastPressure) {
            println("More of the same")
        } else {
            println("Watch out for cooler, rainy weather")
        }
    }
}