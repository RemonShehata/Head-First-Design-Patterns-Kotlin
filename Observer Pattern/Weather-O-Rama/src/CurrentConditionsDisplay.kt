import java.util.*
import java.util.Observer

class CurrentConditionsDisplay(observable: Observable) : Observer, DisplayElement {

    init {
        observable.addObserver(this)
    }

    private var temperature = 0F
    private var humidity = 0F
    private var pressure = 0F

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            val weatherData = o as WeatherData
            temperature = weatherData.temperature
            humidity = weatherData.humidity
            pressure = weatherData.pressure

            display()
        }
    }
}