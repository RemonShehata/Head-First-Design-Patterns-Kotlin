abstract class Beverage {
    open var description = "Unknown beverage"
    open var size: Beverage.Size? = null

    abstract fun getCost(): Float

    enum class Size {
        tall, grande, venti
    }
}