class StatisticsDisplay(weatherData: Subject) : Observer, DisplayElement {
    private var minTemp = 0f
    private var maxTemp = 0f
    private var tempSum = 0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        if (temp < minTemp) {
            minTemp = temp
        }

        if (temp > maxTemp) {
            maxTemp = temp
        }

        tempSum += temp
        numReadings++

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp)
    }
}