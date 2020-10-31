class Whip(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String = "Whip"
        get() = beverage.description + ", Whip"

    override fun getCost(): Float = beverage.getCost() + 0.10f
}