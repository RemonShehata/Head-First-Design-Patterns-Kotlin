class WeatherData : Subject {

    private val observers = mutableListOf<Observer>()
    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F

    //This method gets called whenever the weather measurements have been updated
    private fun measurementsChanged() {
        notifyObservers()
    }

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}