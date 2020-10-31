class DarkRoast : Beverage() {
    override var description = "DarkRoast"

    override fun getCost(): Float {
        return super.getCost() + 30f
    }
}