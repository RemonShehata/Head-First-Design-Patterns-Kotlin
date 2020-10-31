class Decaf : Beverage() {
    override var description = "Decaf"

    override fun getCost(): Float {
        return 1.05f
    }
}