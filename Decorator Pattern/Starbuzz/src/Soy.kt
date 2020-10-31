class Soy(private val beverage: Beverage) : CondimentDecorator() {
    override var description: String = "Soy"
        get() = beverage.description + ", Soy"

    override fun getCost(): Float =
        if (beverage.size == Size.tall) {
            beverage.getCost() + 0.10f
        } else if (beverage.size == Size.venti) {
            beverage.getCost() + 0.20f
        } else {
            beverage.getCost() + 0.15f
        }
}