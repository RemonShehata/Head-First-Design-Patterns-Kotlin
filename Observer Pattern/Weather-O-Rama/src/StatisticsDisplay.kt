import java.util.*
import java.util.Observer

class StatisticsDisplay(observable: Observable) : Observer, DisplayElement {
    private var minTemp = 0f
    private var maxTemp = 0f
    private var tempSum = 0f
    private var numReadings = 0

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            val weatherData = o as WeatherData
            val temp = weatherData.temperature

            if (temp < minTemp) minTemp = temp

            if (temp > maxTemp) maxTemp = temp

            tempSum += temp
            numReadings++

            display()
        }
    }

    override fun display() {
        println(
            "Avg/Max/Min temperature = ${tempSum / numReadings} /$maxTemp/$minTemp"
        )
    }
}