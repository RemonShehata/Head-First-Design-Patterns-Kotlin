import java.util.*

class WeatherData : Observable() {

    var temperature = 0F
    var humidity = 0F
    var pressure = 0F

    //This method gets called whenever the weather measurements have been updated
    private fun measurementsChanged() {
        setChanged()
        notifyObservers()
    }

    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

}