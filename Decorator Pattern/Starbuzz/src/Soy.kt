class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String = "Soy"
        get() = beverage.description + ", Soy"

    override fun getCost(): Float = beverage.getCost() + 0.15f
}