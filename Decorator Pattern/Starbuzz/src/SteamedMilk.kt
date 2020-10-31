class SteamedMilk(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String = "SteamedMilk"
        get() = beverage.description + ", SteamedMilk"

    override fun getCost() = beverage.getCost() + 0.10f
}