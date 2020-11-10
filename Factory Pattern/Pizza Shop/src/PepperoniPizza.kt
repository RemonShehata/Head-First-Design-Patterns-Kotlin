class PepperoniPizza : Pizza() {
    override fun prepare() {
        println("Preparing PepperoniPizza...")
    }

    override fun bake() {
        println("Baking PepperoniPizza...")
    }

    override fun cut() {
        println("Cutting PepperoniPizza...")
    }

    override fun box() {
        println("Boxing PepperoniPizza...")
    }
}
