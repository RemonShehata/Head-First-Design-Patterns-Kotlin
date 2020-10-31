class Decaf : Beverage() {
    override var description = "Decaf"

    override fun getCost(): Float {
        return super.getCost() + 20f
    }
}