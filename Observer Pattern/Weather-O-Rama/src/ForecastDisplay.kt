import java.util.*
import java.util.Observer

class ForecastDisplay(observable: Observable) : Observer, DisplayElement {
    private var currentPressure = 0f
    private var lastPressure = 0f

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData){
            val weatherData = o as WeatherData
            lastPressure = currentPressure
            currentPressure = weatherData.pressure

            display()
        }
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