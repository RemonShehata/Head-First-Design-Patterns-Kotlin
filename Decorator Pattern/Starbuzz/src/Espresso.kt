class Espresso : Beverage() {
    override var description = "Espresso"

    override fun getCost(): Float {
        return 1.99f
    }
}