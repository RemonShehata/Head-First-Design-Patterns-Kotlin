class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(item: String): Pizza? {
        return when (item) {
            "cheese" -> {
                ChicagoStyleCheesePizza()
            }
            "veggie" -> {
                ChicagoStyleVeggiePizza()
            }
            "clam" -> {
                ChicagoStyleClamPizza()
            }
            "pepperoni" -> {
                ChicagoStylePepperoniPizza()
            }
            else -> null
        }
    }
}