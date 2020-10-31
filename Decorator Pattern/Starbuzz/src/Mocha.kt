class Mocha(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String = "Mocha"
        get() = beverage.description + ", Mocha"

    override fun getCost(): Float = beverage.getCost() + 0.20f
}