class HouseBlend : Beverage() {
    override var description = "HouseBlend"

    override fun getCost(): Float {
        return super.getCost() + 10f
    }
}