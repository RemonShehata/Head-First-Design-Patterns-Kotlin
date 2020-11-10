class CheesePizza : Pizza() {
    override fun prepare() {
        println("Preparing CheesePizza...")
    }

    override fun bake() {
        println("Baking CheesePizza...")
    }

    override fun cut() {
        println("Cutting CheesePizza...")
    }

    override fun box() {
        println("Boxing CheesePizza...")
    }
}